package com.example.react.demo.service;

import com.example.react.demo.UserClass;
import com.example.react.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    UserRepository userRepository;


    public void createUser(UserClass userClass) {
        userRepository.save(userClass);
    }

    public List<UserClass> getAllUser() {
        List<UserClass> getAllUsers = userRepository.findAll();
        return getAllUsers;
    }


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }


    public UserClass updateUstate(UserClass userClass) {
        UserClass userUpdate = userRepository.save(userClass);
        return userUpdate;
    }



    public UserClass updateUser(Long id, UserClass userClass) {
        Optional<UserClass> newUserFind = userRepository.findById(id);
        if (newUserFind.isPresent()) {
            UserClass updateUser = newUserFind.get();
            updateUser.setFirstName(userClass.getFirstName());
            updateUser.setSurname(userClass.getSurname());
            updateUser.setDateOfBirth(userClass.getDateOfBirth());
            updateUser.setIdNumber(userClass.getIdNumber());
            updateUser.setUsername(userClass.getUsername());
            updateUser.setPassword(userClass.getPassword());
            updateUser.setEmail(userClass.getEmail());
            updateUser.setCardNumber(userClass.getCardNumber());



            return userRepository.save(updateUser);
        }
        return null; // Return null if the user doesn't exist
    }

}
