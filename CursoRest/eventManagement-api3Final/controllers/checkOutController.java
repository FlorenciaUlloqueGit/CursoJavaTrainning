package com.cursorest.eventmanagementapi2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cursorest.eventmanagementapi2.entities.Participant;
import com.cursorest.eventmanagementapi2.repositories.ParticipantRepository;

//@RepositoryRestController
//@RequestMapping("/events")
public class checkOutController {

	
	/*
	@Autowired
	private ParticipantRepository participantRepository;
	
	@PostMapping("/checkout/{id}")
	public ResponseEntity<Participant> checkin(@PathVariable Long id,PersistentEntityResourceAssembler assembler){
		
		
	/*	Participant participant =participantRepository.findOne(id);
		
		if(participant != null) {
			if(participant.getCheckedIn() ) {
				throw new AlreadyCheckedOutException();
			}
			participant.setCheckedOut(true);
			participantRepository.save(participant);	
		}

	

	
	
	 return ResponseEntity.ok(assembler.toResource(participant));
	}
	}

*/
	
}
