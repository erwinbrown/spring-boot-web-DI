package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.di.app.models.pojo.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	Factura factura;

	@GetMapping("/ver")
	public String verfact(Model m) {

		m.addAttribute("titulo", "Ejemplo de Factura con Inyeccion de dependencia");

		m.addAttribute("factura", factura);

		return "factura/ver";

	}

}
