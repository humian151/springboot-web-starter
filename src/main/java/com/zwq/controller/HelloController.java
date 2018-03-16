package com.zwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试index.html类
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/index")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("welcome","欢迎来到springboot的世界");
        mv.setViewName("/index");
        return mv;
    }
}
