package com.springbootorm.api.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    //Create
    public void addContact(Contact contact){
        contactRepository.save(contact);
    }

    //Read all
    public List<Contact> getAllContacts(){
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    //Read one
    public ArrayList<Contact> getContact(Integer id){
        ArrayList<Contact> contactList = new ArrayList<>();
        contactList.add(contactRepository.findById(id).get());
        return contactList;
    }

    //Update
    public void updateContact(Contact contact, Integer id) {
        contactRepository.save(contact);
    }

    //Delete
    public void deleteContact(Integer id) {
        Contact contactToDelete = contactRepository.findById(id).get();
        contactToDelete.setActivity(false);
        updateContact(contactToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return contactRepository.existsById(id);
    }
    
}
