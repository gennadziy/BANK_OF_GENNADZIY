package com.example.BANK_OF_GENNADZIY.service;

import com.example.BANK_OF_GENNADZIY.model.Test;

import java.util.List;
import java.util.Optional;

public interface TestSevice {
    List<Test> getAllTest();
    Optional <Test> getId(Long id) throws ReflectiveOperationException;
}
