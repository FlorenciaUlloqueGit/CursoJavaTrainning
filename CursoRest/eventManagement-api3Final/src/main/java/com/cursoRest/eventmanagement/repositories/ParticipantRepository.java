package com.cursoRest.eventmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cursoRest.eventmanagement.entities.Organizer;
import com.cursoRest.eventmanagement.entities.Participant;

import antlr.debug.Event;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
