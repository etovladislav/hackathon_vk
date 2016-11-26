package ru.hackathon.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by etovladislav on 26.11.16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String getIndexPage(@RequestParam("viewer_id") String viewerId,
                               @RequestParam("viewer_type") String viewerType,
                               @RequestParam("group_id") String groupId, Model model) {
        model.addAttribute("user", viewerId);
        model.addAttribute("group", groupId);

        if (viewerType.equals("1")) {
            return "index";
        } else if (viewerType.equals("4")) {
            return "admin";
        }
        return "error";
    }

    @RequestMapping("/test")
    public String getTest(@RequestParam("group_id") String groupId, Model model) {
        model.addAttribute("group", groupId);
        return "test";
    }
}
