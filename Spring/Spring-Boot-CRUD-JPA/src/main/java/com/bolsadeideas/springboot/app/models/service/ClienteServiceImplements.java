package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IClienteDao;
import com.bolsadeideas.springboot.app.models.entity.Cliente;


@Service
public class ClienteServiceImplements implements IClienteService {
	//aca inyectamos todos los dao con todos sus métodos en un mismo service
	//si tenemos diferentes dao podemos acceder a los distintos metodos de cada uno como un único punto de acceso
	//la clase service puede manejar las transacciones sin tener que implementar las anotaciones transaccionales en el dao.
	
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true) 
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.delete(id);
		
	}

}
