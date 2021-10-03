package com.example.BANK_OF_GENNADZIY.service;

import com.example.BANK_OF_GENNADZIY.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getId(Long id) throws ReflectiveOperationException;

}
