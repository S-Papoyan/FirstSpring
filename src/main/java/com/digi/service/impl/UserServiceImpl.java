package com.digi.service.impl;

import com.digi.model.User;
import com.digi.model.dto.UserDTO;
import com.digi.service.UserService;
import com.digi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = new User();
        user.setId(0);
        user.setName(userDTO.getFirstName());
        user.setSurname(userDTO.getLastName());
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
    }

    @Override
    public void updateEmail(String email, int id) {
        userRepository.updateEmail(email, id);

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);

    }

//    @Override
//    public User getById(int id) {
//        Optional<User> byId = userRepository.findById(id);
//        User user = byId.get();
//        return user;
//    }
}
