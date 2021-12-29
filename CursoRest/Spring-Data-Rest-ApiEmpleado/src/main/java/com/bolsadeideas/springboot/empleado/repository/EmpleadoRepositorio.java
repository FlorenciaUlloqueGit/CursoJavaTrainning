package com.bolsadeideas.springboot.empleado.repository;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.empleado.entity.Empleado;



public interface EmpleadoRepositorio extends CrudRepository<Empleado, Long> { //clase y tipo de dato del id

}
