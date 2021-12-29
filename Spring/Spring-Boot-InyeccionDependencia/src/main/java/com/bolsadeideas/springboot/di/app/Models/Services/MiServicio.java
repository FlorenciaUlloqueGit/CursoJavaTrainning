package com.bolsadeideas.springboot.di.app.Models.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MiServicioSimple")


public class MiServicio implements IServicio {

	

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple";
	}
}
