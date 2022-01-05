package com.cursoRest.eventmanagement.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import antlr.debug.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

	List<Event> findByName(@Param("name")String name);
}
