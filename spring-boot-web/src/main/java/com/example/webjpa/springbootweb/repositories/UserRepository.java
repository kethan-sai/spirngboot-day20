package com.example.webjpa.springbootweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webjpa.springbootweb.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
