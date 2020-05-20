package com.little.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhaochuanzhen
 * @description :
 * @date : 2020/5/20 17:09
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping
    public String index() {
        return "hello world!";
    }
}
