package com.springbootorm.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    @Autowired
    private UserService userService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }

    //Request: Read all
    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    //Request: Read one by id
    @RequestMapping("/users/{id}")
    public ArrayList<User> readUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id){
        userService.updateUser(user,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    //********************************CRUD LE'Special*******************************************************

    /*
    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}/matches")
    public void getMatchesInUser(@PathVariable Integer id){
        userService.getMatchesInUser(id);
    }
    */
}
