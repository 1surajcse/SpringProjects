package com.scg.ecom.employeeservice.repository;

import com.scg.ecom.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByEmployeeId(Long id) ;
}
