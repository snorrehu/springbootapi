package com.springbootorm.api.association;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssociationService {

    @Autowired
    private AssociationRepository associationRepository;

    //Create
    public void addAssociation(Association association){
        associationRepository.save(association);
    }

    //Read all
    public List<Association> getAllAssociations(){
        List<Association> associations = new ArrayList<>();
        associationRepository.findAll().forEach(associations::add);
        return associations;
    }

    //Read one
    public ArrayList<Association> getAssociation(Integer id){
        ArrayList<Association> associationList = new ArrayList<>();
        associationList.add(associationRepository.findById(id).get());
        return associationList;
    }

    //Update
    public void updateAssociation(Association association, Integer id) {
        associationRepository.save(association);
    }

    //Delete
    public void deleteAssociation(Integer id) {
        associationRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return associationRepository.existsById(id);
    }
}
