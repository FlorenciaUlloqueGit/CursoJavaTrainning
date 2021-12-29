package com.cursoRest.springboot.departament.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cursoRest.springboot.departament.Entity.Departament;



public interface DepartamentRepository extends CrudRepository<Departament, Integer> {

}
