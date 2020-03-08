package com.kevald.tinsearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevald.tinsearch.services.ProductoService;
import com.kevald.tinsearch.entities.Productos;

@RestController
@RequestMapping("/productos")
public class ProductosController {

	@Autowired
	private ProductoService productoservice;
	
	@RequestMapping(value="/productos", method = RequestMethod.GET)
	public List<Productos> getlist(){
		List<Productos> address = productoservice.findAll();
	}
	
}
