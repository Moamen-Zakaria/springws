package com.kn.springwsdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kn.springwsdemo.exception.SomeSOAPException;
import com.kn.springwsdemo.service.PrintService;
import com.kn.springwsdemo.message.Department;
import com.kn.springwsdemo.message.Employee;
import com.kn.springwsdemo.message.GetAllEmployeesRequest;
import com.kn.springwsdemo.message.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Arrays;
import java.util.UUID;

@Endpoint
@AllArgsConstructor
public class EmployeesController {

    private PrintService printService;

    private static final String NAMESPACE_URI = "http://www.kn.com/springsoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesRequest")
    @ResponsePayload
    public GetEmployeeResponse getAllEmployees(@RequestPayload GetAllEmployeesRequest getAllEmployeesRequest) throws JsonProcessingException {

        GetEmployeeResponse getEmployeeResponse = GetEmployeeResponse.builder()
                .listOfEmployees(Arrays.asList(new Employee(UUID.randomUUID().toString(),
                        "ahmed",
                        "mohamed",
                        "ddd@ddd.com",
                        new Department(5, "dddd")), new Employee(UUID.randomUUID().toString(),
                        "Mohammed",
                        "mohamed",
                        "ddd@ddd.com",
                        new Department(5, "dddd"))))
                .build();

        printService.printEmployeesNames(getEmployeeResponse);
        printService.printFlattenedJson(getEmployeeResponse);

        return getEmployeeResponse;
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesRequest")
//    @ResponsePayload
//    public GetEmployeeResponse getAllEmployees(@RequestPayload GetAllEmployeesRequest getAllEmployeesRequest) {
//        throw new SomeSOAPException("Deliberate error");
//    }
}