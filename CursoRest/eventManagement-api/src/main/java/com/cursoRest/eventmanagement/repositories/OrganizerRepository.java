package com.cursoRest.eventmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cursoRest.eventmanagement.entities.Organizer;

import antlr.debug.Event;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}
