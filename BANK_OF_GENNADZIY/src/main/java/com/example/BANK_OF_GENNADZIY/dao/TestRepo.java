package com.example.BANK_OF_GENNADZIY.dao;

import com.example.BANK_OF_GENNADZIY.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long> {
}
