package com.cursoRest.entities.proyections;

import org.springframework.data.rest.core.config.Projection;

import com.cursorest.eventmanagementapi2.entities.Participant;

@Projection(name = "partial2",types = {Participant.class})
public interface participantPartial {

	String getName();
	String getCheckedIn();
	//para llamar la proyección: 
//https:localhost:8080/eventmanagement-api/participants?projection=partial2 
}
