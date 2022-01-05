package com.cursorest.eventmanagementapi2.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cursorest.eventmanagementapi2.entities.Event;
import com.cursorest.eventmanagementapi2.entities.proyections.PartialEventProyection;



@RepositoryRestResource(excerptProjection = PartialEventProyection.class) //especifica que se manejará la colección con la proyección PartialEventProyection. Se aplica la proyección a todos los datos de la coleccion events
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

	
//	List<Event> findByName(@Param("name") String  name);
	//ejemplo para buscar: http://localhost:8080/eventmanagement-api/events/search/findByName?name=Spring Data Rest Training 2
	
	Page<Event> findByName(@Param("name") String  name, Pageable pageable); //permite paginar
	//ejemplo : localhost:8080/eventmanagement-api/venues/search/findByPostalCode?postalCode=78750

	Event findOne(Long id);

	//Page <Event>findByNameAndZoneId(@Param("name")String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);


}
