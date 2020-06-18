package com.example.registrationform.registrationloginspringboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.registrationform.registrationloginspringboot.model.User;
import com.example.registrationform.registrationloginspringboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);

	User save(UserRegistrationDto registration);
}