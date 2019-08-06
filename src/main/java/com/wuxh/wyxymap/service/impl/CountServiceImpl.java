package com.wuxh.wyxymap.service.impl;

import com.wuxh.wyxymap.domin.Count;
import com.wuxh.wyxymap.repository.CountRepository;
import com.wuxh.wyxymap.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {

    @Autowired
    private CountRepository countRepository;

    @Override
    public Count getCount(Long id) {
        return countRepository.getOne(id);
    }

    @Override
    public Count editCount(Count count) {
        return countRepository.save(count);
    }
}
