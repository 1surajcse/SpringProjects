package com.scg.ecom.employeeservice.service;

import com.scg.ecom.employeeservice.entity.Employee;
import com.scg.ecom.employeeservice.repository.EmployeeRepository;
import com.scg.ecom.employeeservice.valueobjects.Address;
import com.scg.ecom.employeeservice.valueobjects.RestTemplateValueObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    RestTemplate restTemplate;
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findByEmployeeId(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public RestTemplateValueObjects findEmployeeWithAddress(Long id) {
        Employee employee=employeeRepository.findByEmployeeId(id);
        Address address=restTemplate.getForObject("http://ADDRESS-SERVICE/addresses/"+employee.getAddressId(), Address.class);
        RestTemplateValueObjects restTemplateValueObjects=new RestTemplateValueObjects();
        restTemplateValueObjects.setEmployee(employee);
        restTemplateValueObjects.setAddress(address);
        return  restTemplateValueObjects;
    }
}
