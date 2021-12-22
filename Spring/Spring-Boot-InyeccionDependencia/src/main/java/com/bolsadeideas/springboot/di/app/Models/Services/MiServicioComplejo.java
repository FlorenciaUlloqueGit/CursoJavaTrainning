package com.bolsadeideas.springboot.di.app.Models.Services;

import org.springframework.stereotype.Component;

@Component 

public class MiServicioComplejo implements IServicio {

	//@primary

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complicado";
	}
}
