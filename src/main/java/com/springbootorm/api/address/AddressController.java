package com.springbootorm.api.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/addresss")
    public void createAddress(@RequestBody Address address){
        int i = 0;
        System.out.println("checkIfExists: " + addressService.checkIfExists(i));
        while(addressService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(addressService.checkIfExists(i));
        }
        address.setAddress_id(i);
        addressService.addAddress(address);
    }

    //Request: Read all
    @RequestMapping("/addresss")
    public List<Address> getAllAddresss(){
        return addressService.getAllAddresss();
    }

    //Request: Read one by id
    @RequestMapping("/addresss/{id}")
    public ArrayList<Address> readAddress(@PathVariable Integer id){
        return addressService.getAddress(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/addresss/{id}")
    public void updateAddress(@RequestBody Address address, @PathVariable Integer id){
        addressService.updateAddress(address,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/addresss/{id}")
    public void deleteAddress(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Address p = new Address(id, null ,"Undefined", "Undefined", d);
        //addressService.updateAddress(p, id);
    }
    
}
