package com.at.learning.controller;

import com.at.learning.dto.User;
import com.at.learning.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") String userId) {
        UUID uuid = UUID.fromString(userId);
        return userService.getById(uuid);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUser() {
        return userService.getAll();
    }
}
