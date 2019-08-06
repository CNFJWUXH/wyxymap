package com.wuxh.wyxymap.controller;

import com.wuxh.wyxymap.domin.Count;
import com.wuxh.wyxymap.service.impl.CountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {

    @Autowired
    private CountServiceImpl countService;

    @RequestMapping("/wyxymap")
    public String toMap(){
        Count count = new Count();
        count = countService.getCount(Long.valueOf(1));
        count.setCountNum(count.getCountNum()+1);
        countService.editCount(count);
        return "wyxymap";
    }
}
