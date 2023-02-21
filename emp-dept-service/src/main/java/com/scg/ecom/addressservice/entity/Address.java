package com.scg.ecom.addressservice.entity;


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
@Table(name="SCG_Address")
public class Address
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long addressId;
    private  String houseNo;
    private String city;
    private String country;
    private Long pinCode;
}
