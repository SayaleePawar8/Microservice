package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{

    //fake User List instead of database
    List<User>  list = List.of(
            new User(8989L, "Sayalee Pawar", "123456789"),
            new User(1144L, "Dhiraj Pawar", "123456563"),
            new User(8980L, "Sanjay Pawar", "123423289"));

    @Override
    public User getUser(Long id) {

        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);

    }
}
