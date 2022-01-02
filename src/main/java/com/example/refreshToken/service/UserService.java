package com.example.refreshToken.service;

import com.example.refreshToken.domain.Role;
import com.example.refreshToken.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
