package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import com.bolsadeideas.springboot.app.models.entity.Cliente;



@Repository("clienteDaoJPA")//anotación de spring para marcar la clase como de componente a persistencia, de acceso a datos. por debajo implementa @component
public class ClienteDaoImplement implements IClienteDao{

	

	@PersistenceContext  //inyencta el entitiy Manager de forma automática
	private EntityManager em;
	@Override
	//@Transactional(readOnly = true) //especifica que es solo una transacción de lectura
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
		
	}
	@Override
	//@Transactional //especifica que se inserta un nuevo registro.
	public void save(Cliente cliente) {
		if(cliente.getId() != null && cliente.getId() > 0 ) { //es decir si existe (para editar)
			em.merge(cliente);
		}else {
			em.persist(cliente); //toma el obj cliente y  lo almacena en un objeto entity en el contexto de persistencia y en la DB
			//para hacer un insert
			
		}
		
		
	}
	//@Transactional(readOnly=true)
	@Override
	public Cliente findOne(Long id) {
		
		return em.find(Cliente.class, id); //lo encuentra de forma automática.
		
	}
	//@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		//Cliente cliente = findOne(id);
		em.remove(findOne(id));
	}
	
	

}
