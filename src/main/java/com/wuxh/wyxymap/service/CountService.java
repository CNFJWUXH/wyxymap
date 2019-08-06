package com.wuxh.wyxymap.service;

import com.wuxh.wyxymap.domin.Count;

public interface CountService {

    public Count getCount(Long id);

    public Count editCount(Count count);
}
