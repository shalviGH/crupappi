package com.example.crud;

import com.example.crud.entity.Users;
import com.example.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAll(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public Optional<Users> getById(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Users users){
        userService.saveOrUpdate(users);
    }

    @DeleteMapping("/{userId}")
    public void saveUpdate(@PathVariable("userId") Long userId){
        userService.delete(userId);
    }


}
