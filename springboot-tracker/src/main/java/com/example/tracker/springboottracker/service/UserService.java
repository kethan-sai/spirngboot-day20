package com.example.tracker.springboottracker.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.tracker.springboottracker.modal.User;
import com.example.tracker.springboottracker.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);

	User save(UserRegistrationDto registration);

	List<User> findAll();
}