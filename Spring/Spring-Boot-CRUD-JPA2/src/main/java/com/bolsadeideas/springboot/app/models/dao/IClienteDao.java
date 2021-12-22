package com.bolsadeideas.springboot.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;


//en T va el objeti y en id el tipo de dato del id
public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
	
	
}
