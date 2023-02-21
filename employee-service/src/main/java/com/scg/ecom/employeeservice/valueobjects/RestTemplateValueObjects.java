package com.scg.ecom.employeeservice.valueobjects;

import com.scg.ecom.employeeservice.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestTemplateValueObjects {
    private Employee employee;
    private Address address;
}
