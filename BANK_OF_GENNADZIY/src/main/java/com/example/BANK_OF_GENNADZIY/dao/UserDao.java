package com.example.BANK_OF_GENNADZIY.dao;

import com.example.BANK_OF_GENNADZIY.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	
}
