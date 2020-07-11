package com.gree.qds.qdscloudprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayHello")
    public String sayhello() {
        return "I`m provider 1 ,Hello consumer! sayHello";
    }

    @RequestMapping("/sayHi")
    public String sayHi() {
        return "I`m provider 1 ,Hello consumer! sayHi";
    }

    @RequestMapping("/sayHaha")
    public String sayHaha() {
        return "I`m provider 1 ,Hello consumer! sayHaha";
    }
}