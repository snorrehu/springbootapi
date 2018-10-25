package com.springbootorm.api.address;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Integer> {
    public Address findByAddress_id(Integer address_id);
}

