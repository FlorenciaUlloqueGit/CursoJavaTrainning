package com.cursoRest.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cursorest.eventmanagementapi2.entities.Event;
import com.cursorest.eventmanagementapi2.repositories.EventRepository;

//@RepositoryRestController //usa Controller y restController al mismo tiempo. Anotación poderosa.
//la dif esta en que si uso esta anotacion puede derivar a la base path. empieza a ser psrte de la api restful 
//@RequestMapping("/events")
public class EventKickOffController {
	
	
	/*
	@Autowired
	private EventRepository eventRepository;

	
	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
		Event event = eventRepository.findOne(id) ;
		
		if (event == null) {
			throw new ResourceNotFoundException();
			
		}
		event.setStarted(true);
		eventRepository.save(event);
		
		return ResponseEntity.ok(event.getName() + "has started");
	}
	
	*/
}
