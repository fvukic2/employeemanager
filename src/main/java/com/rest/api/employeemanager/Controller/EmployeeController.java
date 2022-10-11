package com.rest.api.employeemanager.Controller;

import com.rest.api.employeemanager.domain.entity.Employee;
import com.rest.api.employeemanager.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    private void saveNewEmployee(@RequestBody Employee employee){
        employeeService.saveNewEmployee(employee);
    }

    @GetMapping
    private List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
