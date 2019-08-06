package com.wuxh.wyxymap.repository;

import com.wuxh.wyxymap.domin.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

    @Override
    List<TestEntity> findAll();
}
