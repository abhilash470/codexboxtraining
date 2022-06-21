package com.codexbox.demo.controller;

import com.codexbox.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Employee employee;
    public DemoController(Employee employee){
        this.employee = employee;
    }
    @PostMapping("/employeeClass")
    public ResponseEntity<String>saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>("welcome to microservices"+" " +this.employee.getData()+" "+employee.getEid()+" "+employee.getName()+" "+employee.getAddress()+" "+employee.getSalary(), HttpStatus.OK);
    }

}
