package ru.hackathon.vk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.vk.form.ElementForm;
import ru.hackathon.vk.service.ZoneService;

/**
 * Created by etovladislav on 26.11.16.
 */
@RestController
@RequestMapping(value = "/api/group")
public class GroupController {

    @Autowired
    private ZoneService zoneService;

    @RequestMapping(value = "/zone/create", method = RequestMethod.POST)
    public Long createZone(@RequestParam("name") String name,
                           @RequestParam("groupId") String groupId) {
        return zoneService.createZone(name, groupId);
    }

    @RequestMapping(value = "/zone/create", method = RequestMethod.POST)
    public Long createElement(@ModelAttribute ElementForm elementForm) {
        return zoneService.createElement(elementForm);
    }

}
