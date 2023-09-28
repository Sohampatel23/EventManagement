package com.submit.Event.management.service;

import com.submit.Event.management.model.Event;
import com.submit.Event.management.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService {

    @Autowired
    IEventRepo iEventRepo;

    public String save(Event event) {
        iEventRepo.save(event);
        return "Event added";
    }

    public String deleteById(Long eventId) {
        iEventRepo.deleteById(eventId);
        return "event deleted";
    }

    public List<Event> findAll() {
        return (List<Event>) iEventRepo.findAll();
    }

    public List<Event> findByDate(Date date) {
        return (List<Event>)  iEventRepo.findByDate(date);
    }
}
