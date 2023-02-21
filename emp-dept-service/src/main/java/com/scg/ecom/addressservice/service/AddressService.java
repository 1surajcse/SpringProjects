package com.scg.ecom.addressservice.service;

import com.scg.ecom.addressservice.entity.Address;
import com.scg.ecom.addressservice.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address save(Address employeeDept) {
        log.info("Inside Save Address Service");
        return addressRepository.save(employeeDept);
    }

    public Address findAddressById(Long id) {
        log.info("Inside findAddressById Service");
        return addressRepository.findByAddressId(id);
    }
}
