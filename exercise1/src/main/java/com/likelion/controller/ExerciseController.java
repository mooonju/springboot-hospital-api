package com.likelion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    @RequestMapping("/ex1")
    public String ex1() {
        return "hello world";
    }
}
