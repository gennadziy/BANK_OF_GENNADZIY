package com.example.BANK_OF_GENNADZIY.controller;

import com.example.BANK_OF_GENNADZIY.model.Test;
import com.example.BANK_OF_GENNADZIY.service.TestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MainController {
    @Autowired
    private TestSevice testSevice;

    @GetMapping
    public ResponseEntity<List<Test>> getAll(Long id) {
        return ResponseEntity.ok().body(testSevice.getAllTest());
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
}

