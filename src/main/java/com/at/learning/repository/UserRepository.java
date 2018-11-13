package com.at.learning.repository;

import com.at.learning.dto.User;
import com.at.learning.exception.model.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users;

    UserRepository() {
        users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

    public List<User> returnAllUsers() {
        return users;
    }

    public User returnUser(UUID uuid) {
        User user = users.stream().filter(u -> u.id.equals(uuid)).findFirst().orElse(null);
        if (user == null) {
            throw new NotFoundException("User not found");
        }
        return user;
    }
}
