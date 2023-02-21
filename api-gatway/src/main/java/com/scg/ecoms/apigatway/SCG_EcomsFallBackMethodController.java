package com.scg.ecoms.apigatway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SCG_EcomsFallBackMethodController {

    @GetMapping("/address-fallback")
    public String departmentServiceFallBack(){
        return "Address Service Taking longer than expected, " +
                "Please try after sometime.";
    }
    @GetMapping("/emp-fallback")
    public String employeeServiceFallBack(){
        return "Employee Service Taking longer than expected, " +
                "Please try after sometime.";
    }
}
