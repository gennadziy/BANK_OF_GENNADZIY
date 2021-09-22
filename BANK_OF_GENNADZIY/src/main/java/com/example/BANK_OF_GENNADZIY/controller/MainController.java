package com.example.BANK_OF_GENNADZIY.controller;

import com.example.BANK_OF_GENNADZIY.dao.TestRepo;
import com.example.BANK_OF_GENNADZIY.dao.UserDao;
import com.example.BANK_OF_GENNADZIY.exception.ResourceNotFoundException;
import com.example.BANK_OF_GENNADZIY.model.Test;
import com.example.BANK_OF_GENNADZIY.model.User;
import com.example.BANK_OF_GENNADZIY.model.UserDTO;
import com.example.BANK_OF_GENNADZIY.service.TestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MainController {
    @Autowired
    private TestSevice testSevice;
    @Autowired
    private TestRepo testRepo;

    @Autowired
    private UserDao userDao;

    @GetMapping
//    @Cacheable("test")
    public ResponseEntity<List<Test>> getAll(Long id) throws InterruptedException {
//        Thread.sleep(3000);
        return ResponseEntity.ok().body(testSevice.getAllTest());
    }
    @GetMapping("/sort")
//    @Cacheable("test")
    public ResponseEntity<List<Test>> getAllTestSort() {
        return ResponseEntity.ok().body(testRepo.findAllTest(JpaSort.unsafe("LENGTH(name)")));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Test> add(@RequestBody Test test) {
        List<Test> list = new ArrayList<>();
        return ResponseEntity.ok().body(this.testSevice.createTest(test));
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<Test> ane(@PathVariable("id") Long id) throws Exception {
        Test tEst = testSevice.getId(id).orElseThrow(() -> new Exception("NOT FOUND ID"));
        return ResponseEntity.ok().body(tEst);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deletePlanet(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException, ReflectiveOperationException {
        Test test = testSevice.getId(id)
                .orElseThrow(() -> new ResourceNotFoundException("Test not found for this id :: " + id));
        testSevice.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
