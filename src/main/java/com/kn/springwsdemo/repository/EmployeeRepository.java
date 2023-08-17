package com.kn.springwsdemo.repository;

import com.kn.springwsdemo.message.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EmployeeRepository {

    private static final Map<UUID, Employee> employees = new HashMap<>();


    public static Employee findEmployee(String name) {
        return employees.get(name);
    }

    public static UUID saveEmployee(Employee employee) {

        UUID uuid = UUID.randomUUID();
        employees.put(uuid, employee);
        return uuid;

    }

}