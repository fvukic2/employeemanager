package com.rest.api.employeemanager.repository;

import com.rest.api.employeemanager.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
