package com.kn.springwsdemo.controller;

import com.kn.springwsdemo.message.Department;
import com.kn.springwsdemo.message.Employee;
import com.kn.springwsdemo.message.GetAllEmployeesRequest;
import com.kn.springwsdemo.message.GetEmployeeResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.UUID;

@Endpoint
public class EmployeesController {

    private static final String NAMESPACE_URI = "http://www.kn.com/springsoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesRequest")
    @ResponsePayload
    public JAXBElement<GetEmployeeResponse> getAllEmployees(@RequestPayload GetAllEmployeesRequest getAllEmployeesRequest) {

        return new JAXBElement(new QName("http://www.kn.com/springsoap","getEmployeeResponse"),GetEmployeeResponse.class , GetEmployeeResponse.builder()
                .element(Arrays.asList(new Employee(UUID.randomUUID().toString(),
                        "ahmed",
                        "mohamed",
                        "ddd@ddd.com",
                        new Department(5, "dddd"))))
                .build()) ;
    }
}