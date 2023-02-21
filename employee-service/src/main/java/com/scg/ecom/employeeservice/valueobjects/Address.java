package com.scg.ecom.employeeservice.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address
{
    private  Long addressId;
    private  String houseNo;
    private String city;
    private String country;
    private Long pinCode;
}
