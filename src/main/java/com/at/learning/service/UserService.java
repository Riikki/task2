package com.at.learning.service;

import com.at.learning.dto.User;
import com.at.learning.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserRepository userRepository;

    public User getById(UUID uuid) {
        LOG.info("get user from memory");
        return userRepository.returnUser(uuid);
    }

    public List<User> getAll() {
        LOG.info("get all users from memory");
        return userRepository.returnAllUsers();
    }
}
