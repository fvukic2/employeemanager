package com.rest.api.employeemanager.Controller;

import com.rest.api.employeemanager.domain.entity.Employee;
import com.rest.api.employeemanager.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    @ApiOperation(value = "Adds new Employee to database", notes = "Enter all Employee parameters to add new Employee object to database", response = Employee.class)
    private void saveNewEmployee(@ApiParam(value = "Employee value gets passed to the database") @RequestBody Employee employee){
        employee.setId(0);
        employeeService.saveNewEmployee(employee);
    }

    @GetMapping
    @ApiOperation(value = "Returns all Employees from database", response = Employee.class)
    private List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletes Employee from database", notes = "Enter Employee id to delete Employee object from database", response = Employee.class)
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping()
    @ApiOperation(value = "Updates Employee in database", notes = "Enter Employee id to update Employee object in database", response = Employee.class)
    private void updateEmployee(@RequestBody Employee employee){
        employeeService.saveNewEmployee(employee);
    }
}
