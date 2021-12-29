package com.cursoRest.eventmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cursoRest.eventmanagement.entities.Organizer;
import com.cursoRest.eventmanagement.entities.Venue;

import antlr.debug.Event;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
