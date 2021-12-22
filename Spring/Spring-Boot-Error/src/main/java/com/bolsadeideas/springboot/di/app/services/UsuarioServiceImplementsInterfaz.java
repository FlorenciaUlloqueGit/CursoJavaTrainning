package com.bolsadeideas.springboot.di.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.di.app.Models.Usuario;


@Service
public class UsuarioServiceImplementsInterfaz implements UsuarioService {

	
	private List<Usuario> lista;
	
	public UsuarioServiceImplementsInterfaz() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario (1, "Florencia", "ulloque"));
		this.lista.add(new Usuario (2, "Mateo", "Guzmán"));
		this.lista.add(new Usuario (3, "Lucas", "Lando"));
		this.lista.add(new Usuario (4, "yuliana", "Rodriguez"));
		this.lista.add(new Usuario (5, "Luci", "Fernández"));
		this.lista.add(new Usuario (6, "Paco", "Gomez"));
		
		
	}
	
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {

		Usuario resultado = null;
		for(Usuario u : this.lista) {
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {

			Usuario usuario= this.obtenerPorId(id);
		return Optional.ofNullable(usuario);  //de forma estatica invocamos el metodo off
	} //el metodo of convierte ese objeto usuario que tenemos independientemente si es nulo o no, lo convertimos en opcional.
	//tenemos el método off y el offNullable. el of no acepta nulos y el offNullable no tira error y continua funcionando correctamente


}
