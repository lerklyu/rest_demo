package com.example.demo.repository;

import com.example.demo.model.Authorities;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {

    private final HashMap<String, User> userInfo;

    public UserRepository(HashMap<String, User> userInfo) {
        this.userInfo = userInfo;
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userInfo.containsKey(user)) {
            User userObj = userInfo.get(user);
            if (userObj.getPassword().equals(password)) {
                return userObj.getAuthorities();
            }
        }
        return List.of();
    }
}
