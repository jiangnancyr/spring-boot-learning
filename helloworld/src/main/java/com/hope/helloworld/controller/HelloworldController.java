package com.hope.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyrcreate
 * @create 2020-06-14 8:46
 */
@RestController
public class HelloworldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
