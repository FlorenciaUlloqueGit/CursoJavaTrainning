package com.cursoRest.eventmanagement.entities;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class Organizer extends AbstractEntity {
	private String name;
	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvent(Set<Event> events) {
		this.events = events;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Organizer)obj).id) ;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}

}
