package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.pojo.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.pojo.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
    
	@Primary
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();

	}
	
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejp() {
		return new MiServicioComplejo();

	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registroItems(){
		
		Producto producto1 = new Producto("Camara Vaio", 150);
		Producto producto2 = new Producto("Tabla Surf largo 70", 450);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 3); 
		
		return Arrays.asList(linea1, linea2);
		
		
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registroItemsOficina(){
		
		Producto producto1 = new Producto("Monitor LG LCD 21", 215);
		Producto producto2 = new Producto("Notebook Asus 17", 950);
		
		Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
		Producto producto4 = new Producto("Escrito de Oficina", 350);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 3);
		
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		ItemFactura linea4 = new ItemFactura(producto4, 2); 
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
		
		
	}
			
	

}
