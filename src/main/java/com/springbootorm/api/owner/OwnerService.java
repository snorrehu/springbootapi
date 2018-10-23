package com.springbootorm.api.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    //Create
    public void addOwner(Owner owner){
        ownerRepository.save(owner);
    }

    //Read all
    public List<Owner> getAllOwners(){
        List<Owner> owners = new ArrayList<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    //Read one
    public ArrayList<Owner> getOwner(Integer id){
        ArrayList<Owner> ownerList = new ArrayList<>();
        ownerList.add(ownerRepository.findById(id).get());
        return ownerList;
    }

    //Update
    public void updateOwner(Owner owner, Integer id) {
        ownerRepository.save(owner);
    }

    //Delete
    public void deleteOwner(Integer id) {
        ownerRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return ownerRepository.existsById(id);
    }
    
}
