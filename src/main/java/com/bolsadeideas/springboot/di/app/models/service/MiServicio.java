package com.bolsadeideas.springboot.di.app.models.service;

/*import org.springframework.stereotype.Component;*/

/*@Component("miServicioSimple")*/
public class MiServicio implements IServicio {

	
	public MiServicio() {
		
	}

	@Override
	public String operacion() {

		return "Ejecutando algún proceso importante simple...";

	}
	
	
	
}
