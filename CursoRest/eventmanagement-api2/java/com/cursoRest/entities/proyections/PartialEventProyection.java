package com.cursorest.eventmanagementapi2.entities.proyections;


import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.cursorest.eventmanagementapi2.entities.Event; //asegurarse que este sea el import



@Projection(name="partial",types= {Event.class}) //evento por el cualse creo la proyección. De donde queremos obtener los getters 
public interface PartialEventProyection {
//se muestran solo estos 3 campos de la clase events
	String getName();
	ZonedDateTime getStartTime();
	ZonedDateTime getEndTime();
	
	Instant getCreated(); //esto suele ser ignorado pero se lo agregamos a la proyección y lo muestra
}
//para llamar la proyección: 
//https:localhost:8080/eventmanagement-api/events?projection=partial (nombre de la proyección)