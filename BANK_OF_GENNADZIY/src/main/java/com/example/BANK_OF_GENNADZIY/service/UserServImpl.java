package com.example.BANK_OF_GENNADZIY.service;

import com.example.BANK_OF_GENNADZIY.dao.UserDao;
import com.example.BANK_OF_GENNADZIY.model.Test;
import com.example.BANK_OF_GENNADZIY.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Optional<User> getId(Long id) throws ReflectiveOperationException {
        Optional<User> user = userDao.findById(id);
        if (user == null) {
            throw new ReflectiveOperationException();
        }
        return user;
    }

}
