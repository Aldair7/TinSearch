package com.kevald.tinsearch.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.kevald.tinsearch.models.entities.Producto;
import com.kevald.tinsearch.models.services.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
    private ProductoService service;
	
	@GetMapping("/productos")
	public List<Producto> list() {
	    return service.listAll();
    } 
	// RESTful API methods for Retrieval operations
	    @GetMapping("/productos/{id}")
	    public ResponseEntity<Producto> get(@PathVariable Integer id) {
	        try {
	            Producto productos = service.get(id);
	            return new ResponseEntity<Producto>(productos, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
	        }      
	    }
     
    // RESTful API method for Create operation
     
	    @PostMapping("/productos")
	    public void add(@RequestBody Producto productos) {
	        service.save(productos);
	    }
	    
    // RESTful API method for Update operation
	    @PutMapping("/productos/{id}")
	    public ResponseEntity<Producto> update(@RequestBody Producto productos, 
	    		@PathVariable Integer id) {
	        try {
	            Producto existProducto = service.get(id);
	            service.save(productos);
	            
	            return new ResponseEntity<Producto>(existProducto, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
	            }   
	        }       
     
    // RESTful API method for Delete operation
	    @DeleteMapping("/productos/{id}")
	    public void delete(@PathVariable Integer id) {
	        service.delete(id);
	    }
}

