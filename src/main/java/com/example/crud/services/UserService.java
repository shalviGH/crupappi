package com.example.crud.services;

import com.example.crud.entity.Users;
import com.example.crud.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Optional<Users> getUser(Long id){
        return userRepository.findById(id);
    }

    public void saveOrUpdate(Users users){
        userRepository.save(users);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
