package com.rest.api.employeemanager.service;

import com.rest.api.employeemanager.domain.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void saveNewEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
