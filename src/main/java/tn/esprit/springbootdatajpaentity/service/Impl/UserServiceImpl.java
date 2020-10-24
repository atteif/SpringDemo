package tn.esprit.springbootdatajpaentity.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.esprit.springbootdatajpaentity.entities.User;
import tn.esprit.springbootdatajpaentity.repository.UserRepository;
import tn.esprit.springbootdatajpaentity.service.UserService;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
