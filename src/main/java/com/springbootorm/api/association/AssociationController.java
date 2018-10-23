package com.springbootorm.api.association;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class AssociationController {
    
    @Autowired
    private AssociationService associationService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/associations")
    public void createAssociation(@RequestBody Association association){
        int i = 0;
        System.out.println("checkIfExists: " + associationService.checkIfExists(i));
        while(associationService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(associationService.checkIfExists(i));
        }
        association.setAssociation_id(i);
        associationService.addAssociation(association);
    }

    //Request: Read all
    @RequestMapping("/associations")
    public List<Association> getAllAssociations(){
        return associationService.getAllAssociations();
    }

    //Request: Read one by id
    @RequestMapping("/associations/{id}")
    public ArrayList<Association> readAssociation(@PathVariable Integer id){
        return associationService.getAssociation(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/associations/{id}")
    public void updateAssociation(@RequestBody Association association, @PathVariable Integer id){
        associationService.updateAssociation(association,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/associations/{id}")
    public void deleteAssociation(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Association p = new Association(id, null ,"Undefined", "Undefined", d);
        //associationService.updateAssociation(p, id);
    }
    
}
