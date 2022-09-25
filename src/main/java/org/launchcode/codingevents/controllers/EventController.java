package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();
    private static HashMap<String,String> events = new HashMap<String, String>();

    @GetMapping
    public String eventHandler(Model model) {
//        List<String> events = new ArrayList<>();
//        events.add("Graduation");
//        events.add("Birthday");
//        events.add("Christmas");
//        model.addAttribute("events", events);
        events.put("Menteaship","A fun meetup for connecting with mentors");
        events.put("Code With Pride","A fun meetup sponsored by LaunchCode");
        events.put("Javascripty", "An imaginary meetup for Javascript developers");
        model.addAttribute("events", events);
        return "events/index";

    }

    // lives at /events/create
//    @GetMapping("create")
//    public String renderCreateEventForm() {
//        return "events/create";
//    }
//
//    // lives at /events/create
//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//
//    }
}
