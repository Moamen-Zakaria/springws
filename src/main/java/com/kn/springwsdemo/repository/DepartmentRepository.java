package com.kn.springwsdemo.repository;

import com.kn.springwsdemo.message.Department;
import com.kn.springwsdemo.message.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}