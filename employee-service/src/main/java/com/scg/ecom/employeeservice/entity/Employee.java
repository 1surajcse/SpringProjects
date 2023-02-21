package com.scg.ecom.employeeservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="SCG_Employee")
public class Employee
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long employeeId;
    private  String firstName;
        private String lastName;
    private  String email;
    private Long addressId;
}
