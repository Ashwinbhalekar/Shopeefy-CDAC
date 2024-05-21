package com.shopeefy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopeefy.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
