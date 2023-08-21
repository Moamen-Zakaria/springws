package com.kn.springwsdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wnameless.json.flattener.JsonFlattener;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.kn.springwsdemo.message.GetEmployeeResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class PrintService {

    public void printEmployeesNames(GetEmployeeResponse getEmployeeResponse) {

        DocumentContext jsonContext = JsonPath.parse(jsonify(getEmployeeResponse));
        List<String> listOfNames = jsonContext.read("$.listOfEmployees[*].firstName");
        log.info("list of employees' names: \n" + listOfNames);

    }

    public void printFlattenedJson(GetEmployeeResponse getEmployeeResponse) {

        String flattenedJson = JsonFlattener.flatten(jsonify(getEmployeeResponse));
        log.info("Flattened object:\n" + flattenedJson);

    }

    private <T> String jsonify(T object) {

        String json;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            json = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

}
