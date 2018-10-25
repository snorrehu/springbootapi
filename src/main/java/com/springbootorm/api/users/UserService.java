package com.springbootorm.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(Users users) {
        userRepository.save(users);
    }

    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    //Read one
    public ArrayList<Users> getUser(Integer id){
        ArrayList<Users> usersList = new ArrayList<>();
        usersList.add(userRepository.findById(id).get());
        return usersList;
    }

    //Update
    public void updateUser(Users users, Integer id) {
        userRepository.save(users);
    }

    public void deleteUser(Integer id) {
        Users userToDelete = userRepository.findById(id).get();
        userToDelete.setActivity(false);
        updateUser(userToDelete,id);    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return userRepository.existsById(id);
    }

    /*
    public List<Match> getMatchesInUser(Integer userId){
        return userRepository.findByUser_id(userId);
    }
    */
}
