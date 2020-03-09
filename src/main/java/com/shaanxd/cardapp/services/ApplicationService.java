package com.shaanxd.cardapp.services;

import com.shaanxd.cardapp.entities.User;
import com.shaanxd.cardapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private UserRepository userRepository;

    @Autowired
    public ApplicationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean postUser(User user) {
        User savedUser = userRepository.save(user);
        return true;
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
