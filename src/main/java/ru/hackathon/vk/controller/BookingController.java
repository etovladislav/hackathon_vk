package ru.hackathon.vk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by etovladislav on 26.11.16.
 */
@RestController
@RequestMapping(value = "/api/booking")
public class BookingController {


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createBook() {

    }
}
