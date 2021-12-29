package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.Models.Dominio.ItemFactura;
import com.bolsadeideas.springboot.di.app.Models.Dominio.Producto;
import com.bolsadeideas.springboot.di.app.Models.Services.IServicio;
import com.bolsadeideas.springboot.di.app.Models.Services.MiServicio;
import com.bolsadeideas.springboot.di.app.Models.Services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("MiServicio")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	//@Primary
	@Bean("MiServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("ItemFactura")
	 @Qualifier("ItemFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony", 20000);
		Producto producto2 = new Producto("Bicicleta oxea riddich", 55000);

		ItemFactura linea1 = new ItemFactura(producto1, 3);
		ItemFactura linea2 = new ItemFactura(producto2, 5);

		return Arrays.asList(linea1, linea2);

	}

	@Bean("ItemFacturaOficina")
	// @Qualifier("ItemFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG", 23000);
		Producto producto2 = new Producto("Notebook asus", 155000);
		Producto producto3 = new Producto("Impresora HP", 13000);
		Producto producto4 = new Producto("Escritorio Oficina", 14000);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 2);

		return Arrays.asList(linea1, linea2, linea3, linea4);

	}

}
