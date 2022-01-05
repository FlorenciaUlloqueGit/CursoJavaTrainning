package com.cursorest.eventmanagementapi2.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cursorest.eventmanagementapi2.entities.Participant;




public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
	Page<Participant> findByEmail(@Param("email")String email, Pageable pageable);
	//Ejemplo:  http://localhost:8080/eventmanagement-api/participants/search/findByEmail?email=johnf@gmail.com
}
