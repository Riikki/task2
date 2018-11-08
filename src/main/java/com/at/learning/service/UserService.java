package com.at.learning.service;

import com.at.learning.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getById(String uuid) {
        System.out.println("get user from file");
        return new User();
    }
}
