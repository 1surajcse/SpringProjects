package com.scg.ecom.employeeservice.controller;


import com.scg.ecom.employeeservice.entity.Employee;
import com.scg.ecom.employeeservice.service.EmployeeService;
import com.scg.ecom.employeeservice.valueobjects.RestTemplateValueObjects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
    log.info("Inside Save Employee Controller");
        return  employeeService.save(employee);
}


    @GetMapping("emp/{id}")
    public Employee findEmployee(@PathVariable Long id){
        log.info("Inside Save Employee Controller");
        return  employeeService.findEmployeeById(id);
    }

    @GetMapping("/{id}")
    public RestTemplateValueObjects findEmployeeWithAddress(@PathVariable Long id){
        log.info("Inside get emp with Address Controller");
        return employeeService.findEmployeeWithAddress(id);

    }
}
