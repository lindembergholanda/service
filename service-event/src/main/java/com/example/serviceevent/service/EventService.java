package com.example.serviceevent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.serviceevent.model.Event;
import com.example.serviceevent.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event save(@Validated Event event) {
        return eventRepository.save(event);
    }

    public Event findById(Long id){
        return eventRepository.findOne(id);
    }

    public Iterable<Event> findAll(){
        return eventRepository.findAll();
    }

    public void delete(Long id) {
    	eventRepository.delete(id);
    }
}