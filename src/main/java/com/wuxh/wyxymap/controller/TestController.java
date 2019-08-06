package com.wuxh.wyxymap.controller;

import com.wuxh.wyxymap.domin.TestEntity;
import com.wuxh.wyxymap.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String index(Model model){
  /*      TestEntity t = testService.getAllTest().get(0);
        model.addAttribute("test",t);
        model.addAttribute("word","Hello SpringBoot!");
        System.out.println("Hello SpringBoot!");*/
        return "index";
    }
}
