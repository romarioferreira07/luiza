package com.example.romario.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.romario.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}