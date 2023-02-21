package com.scg.ecom.addressservice.repository;


import com.scg.ecom.addressservice.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface AddressRepository extends JpaRepository<Address, Long> {
    public Address findByAddressId(Long id) ;
}
