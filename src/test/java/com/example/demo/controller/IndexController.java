package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello, World";
    }
    @GetMapping("/abc123")
    public @ResponseBody String abc123() {
        return "Hello, abc123!!";
    
    }
    @GetMapping("/박진환")
    public @ResponseBody String 박진환() {
        return "안녕하세요 박진환 입니다";
    
    }
}
