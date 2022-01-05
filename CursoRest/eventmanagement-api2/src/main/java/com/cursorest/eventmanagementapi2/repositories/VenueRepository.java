package com.cursorest.eventmanagementapi2.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cursorest.eventmanagementapi2.entities.Event;
import com.cursorest.eventmanagementapi2.entities.Venue;



public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

	
	Page<Venue> findByPostalCode(@Param("postalCode") String postalCode,Pageable pageable);
  //List<Venue>  findByPostalCode(String postalCode);
}

