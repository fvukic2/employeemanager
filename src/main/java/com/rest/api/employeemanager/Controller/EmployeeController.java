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
        employee.setId(0);
        employeeService.saveNewEmployee(employee);
    }

    @GetMapping
    private List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping()
    private void updateEmployee(@RequestBody Employee employee){
        employeeService.saveNewEmployee(employee);
    }
}
