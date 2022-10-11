package com.digi.service;

import com.digi.model.User;
import com.digi.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(int id);

    void save(UserDTO userDTO);
}
