package com.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    @GetMapping("/ping")
    public String display()
    {
        return "pong";
    }
    @GetMapping("")
    public String displayRoot()
    {
        return "Hello";
    }
}
