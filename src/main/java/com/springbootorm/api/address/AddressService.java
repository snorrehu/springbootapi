package com.springbootorm.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    //Create
    public void addAddress(Address address){
        addressRepository.save(address);
    }

    //Read all
    public List<Address> getAllAddresss(){
        List<Address> addresss = new ArrayList<>();
        addressRepository.findAll().forEach(addresss::add);
        return addresss;
    }

    //Read one

    /**
     *
     * @param id
     * @return
     */
    public ArrayList<Address> getAddress(Integer id){
        ArrayList<Address> addressList = new ArrayList<>();
        addressList.add(addressRepository.findById(id).get());
        return addressList;
    }

    //Update
    public void updateAddress(Address address, Integer id) {
        addressRepository.save(address);
    }

    //Delete
    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return addressRepository.existsById(id);
    }
}
