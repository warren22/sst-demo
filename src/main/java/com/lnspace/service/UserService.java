package com.lnspace.service;

import java.util.List;

import com.lnspace.model.User;

public interface UserService {
    public User findById(Long id);
    public User findByUsername(String username);
    public List<User> findAll ();
}