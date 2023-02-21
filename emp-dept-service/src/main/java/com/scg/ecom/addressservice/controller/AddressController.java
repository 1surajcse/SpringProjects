package com.scg.ecom.addressservice.controller;

import com.scg.ecom.addressservice.entity.Address;

import com.scg.ecom.addressservice.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
@Slf4j
public class AddressController {


    @Autowired
    AddressService addressService;
    @PostMapping("/")
    public Address saveAddress(@RequestBody Address address){
    log.info("Inside Save Address Controller");
        return  addressService.save(address);
}


    @GetMapping("/{id}")
    public Address findAddress(@PathVariable Long id){
        log.info("Inside find Address Controller");
        return  addressService.findAddressById(id);
    }
}
