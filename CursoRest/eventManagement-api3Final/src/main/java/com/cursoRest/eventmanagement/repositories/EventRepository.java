package com.cursoRest.eventmanagement.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import antlr.debug.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

	List<Event> findByName(@Param("name")String name);
	
	//pra habilitar el nivel de config de seguridad
	//debo hacerle override al metodo delete para configurar el nivel de seguridad del borrar
	
	
	//@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')") //configura el nivel del metodo de seguridad en el repositorio
	void delete(Long id);
	
	//lo puedo corroborar poniendo en authorization en postman usuario y contra del admin, y no de florencia, guardando los cambios en delete y enviando la petición.
}
