package ru.hackathon.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by etovladislav on 26.11.16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }
}
