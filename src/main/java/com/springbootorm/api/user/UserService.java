package com.springbootorm.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    //Read one
    public ArrayList<User> getUser(Integer id){
        ArrayList<User> userList = new ArrayList<>();
        userList.add(userRepository.findById(id).get());
        return userList;
    }

    //Update
    public void updateUser(User user, Integer id) {
        userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    /*
    public List<Match> getMatchesInUser(Integer userId){
        return userRepository.findByUser_id(userId);
    }
    */
}
