package com.wuxh.wyxymap.controller;

import com.wuxh.wyxymap.domin.Count;
import com.wuxh.wyxymap.service.CountService;
import com.wuxh.wyxymap.service.impl.CountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CountServiceImpl countService;

    @RequestMapping("/index")
    public String toAdminIndex(){
        return "admin/index";
    }

    @RequestMapping("coordinate")
    public String toCoordinate(){ return "admin/coordinate";}

    @RequestMapping("/place2")
    public String toInput(){
        return "admin/place2";
    }

    @RequestMapping("/getCount")
    @ResponseBody
    public Long getCount(){
        Count count = countService.getCount(Long.valueOf(1));
        Long countNum = count.getCountNum();
        return  countNum;
    }
}
