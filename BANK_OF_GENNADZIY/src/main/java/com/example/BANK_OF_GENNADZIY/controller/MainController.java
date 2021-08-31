package com.example.BANK_OF_GENNADZIY.controller;

import com.example.BANK_OF_GENNADZIY.model.Test;
import com.example.BANK_OF_GENNADZIY.service.TestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private TestSevice testSevice;

    @GetMapping
    public ResponseEntity<List<Test>> getAll(Long id) {
        return ResponseEntity.ok().body(testSevice.getAllTest());
    }

}

