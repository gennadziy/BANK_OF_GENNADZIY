package com.example.BANK_OF_GENNADZIY.dao;

import com.example.BANK_OF_GENNADZIY.model.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TestRepo extends JpaRepository<Test, Long> {

    @Query(value = "SELECT u FROM Test u WHERE u.name like 'GENNADZIY'")
    List<Test> findAllTest(Sort sort);
}
