package com.cursorest.eventmanagementapi2.entities.proyections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.cursorest.eventmanagementapi2.entities.Venue;

@Projection(name="virtual", types= {Venue.class})
public interface StreetAdressProjection {
	
	@Value("#{target.streetAddress} #{target.streetAddress2}") //uno las dos direcciones
String	getCompleteStreetAdress(); //no existe un campo con este nombre pero la creo con value
}
