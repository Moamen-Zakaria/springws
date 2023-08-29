package com.kn.springwsdemo.repository;

import com.kn.springwsdemo.message.Employee;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationFactory {

    public static Specification<Employee> hasDepartmentName(String departmentName) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("departments").get("departmentName"), departmentName);
    }

}
