package com.digi.controller;

import com.digi.model.User;
import com.digi.model.dto.UserDTO;
import com.digi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/get-single-user")
    public User getById(@RequestParam int id) {
        return userService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
    }


    @PatchMapping("{id}")
    public void updateEmail(@PathVariable int id, @RequestParam String email) {
        userService.updateEmail(email, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
}
