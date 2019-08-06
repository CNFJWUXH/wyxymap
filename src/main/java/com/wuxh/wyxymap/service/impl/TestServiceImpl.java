package com.wuxh.wyxymap.service.impl;

import com.wuxh.wyxymap.repository.TestRepository;
import com.wuxh.wyxymap.domin.TestEntity;
import com.wuxh.wyxymap.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestEntity> getAllTest() {
        return testRepository.findAll();
    }
}
