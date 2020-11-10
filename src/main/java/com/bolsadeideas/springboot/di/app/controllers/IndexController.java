package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	@Autowired
	/* @Qualifier("miServicioComplejo") */
  	private IServicio servicio;
	
	/* inyeccion desde el contructor
	 * @Autowired public IndexController(IServicio serv) {
	 * 
	 * this.servicio = serv;
	 * 
	 * }
	 */

	@GetMapping({ "/", "", "/index" })
	public String index(Model m) {

		m.addAttribute("titulo", "Inyeccion de Dependencia Anotacion @Primary");
		m.addAttribute("objeto", servicio.operacion());

		return "index";

	}

	/*
	 * inyeccion desde funcion setter
	 * 
	 * @Autowired public void setServicio(IServicio servicio) { this.servicio =
	 * servicio; }
	 */

}
