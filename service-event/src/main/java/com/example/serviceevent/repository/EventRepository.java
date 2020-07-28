package com.example.serviceevent.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.serviceevent.model.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
}