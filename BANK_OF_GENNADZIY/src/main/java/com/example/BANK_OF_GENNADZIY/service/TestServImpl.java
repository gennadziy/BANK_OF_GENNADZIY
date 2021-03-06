package com.example.BANK_OF_GENNADZIY.service;

import com.example.BANK_OF_GENNADZIY.dao.TestRepo;
import com.example.BANK_OF_GENNADZIY.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TestServImpl implements TestSevice {
    @Autowired
    private TestRepo testRepo;

    @Override
    public List<Test> getAllTest() {
        return testRepo.findAll();
    }

    @Override
    public Optional<Test> getId(Long id) throws ReflectiveOperationException {
        Optional<Test> test = testRepo.findById(id);
        if(test == null){
            throw  new ReflectiveOperationException();
        }
        return test;
    }

    @Override
    public Test createTest(Test test) {
        return testRepo.save(test);
    }

    @Override
    public Test delete(long id) {
//        return testRepo.getById(id);
        testRepo.deleteById(id);
        return null;
    }
}
