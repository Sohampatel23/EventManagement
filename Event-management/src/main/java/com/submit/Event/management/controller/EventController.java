package com.submit.Event.management.controller;

import com.submit.Event.management.model.Event;
import com.submit.Event.management.service.EventService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;
    private Date date;

    @PostMapping("/add")
    public String addEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @DeleteMapping("/deleteEvent/{eventId}")
    public String deleteEvent(@PathVariable Long eventId) {
        return eventService.deleteById(eventId);
    }

    @GetMapping("/allEvent")
    public List<Event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("/byDate/{date}")
    public List<Event> getEventsByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {

        return eventService.findByDate(date);
    }
}
