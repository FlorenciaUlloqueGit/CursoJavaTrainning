package com.cursorest.eventmanagementapi2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cursorest.eventmanagementapi2.entities.Organizer;



public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
