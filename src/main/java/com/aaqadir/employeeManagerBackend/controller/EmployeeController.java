package com.aaqadir.employeeManagerBackend.controller;

import com.aaqadir.employeeManagerBackend.model.Employee;
import com.aaqadir.employeeManagerBackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployeesController() {
        List<Employee> allEmp = employeeService.findAllEmployees();
        return new ResponseEntity<>(allEmp, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeByIdController(@PathVariable("id") Long id) {
        Employee findEmp = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(findEmp, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployeeController(@RequestBody Employee employee) {
        Employee addNewEmp = employeeService.addEmployee(employee);
        return new ResponseEntity<>(addNewEmp, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployeeController(@RequestBody Employee employee) {
        Employee updateNewEmp = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateNewEmp, HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deleteEmployeeByIdController(@PathVariable("id") Long id) {
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>("deleted successfully!",HttpStatus.OK);
    }
}
