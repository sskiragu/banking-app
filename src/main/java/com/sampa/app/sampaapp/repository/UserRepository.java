package com.sampa.app.sampaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sampa.app.sampaapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
