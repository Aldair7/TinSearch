package com.kevald.tinsearch.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.kevald.tinsearch.models.entities.Categoria;
import com.kevald.tinsearch.models.services.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired
    private CategoriaService service;
	
	@GetMapping("/categorias")
	public List<Categoria> list() {
	    return service.listAll();
    } 
	// RESTful API methods for Retrieval operations
	    @GetMapping("/categorias/{id}")
	    public ResponseEntity<Categoria> get(@PathVariable Integer id) {
	        try {
	            Categoria categorias = service.get(id);
	            return new ResponseEntity<Categoria>(categorias, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
	        }      
	    }
     
    // RESTful API method for Create operation
     
	    @PostMapping("/categorias")
	    public void add(@RequestBody Categoria categorias) {
	        service.save(categorias);
	    }
    // RESTful API method for Update operation
	    @PutMapping("/categorias/{id}")
	    public ResponseEntity<Categoria> update(@RequestBody Categoria categorias, 
	    		@PathVariable Integer id) {
	        try {
	            Categoria existCategoria = service.get(id);
	            service.save(categorias);
	            
	            return new ResponseEntity<Categoria>(existCategoria, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }      
	    }
     
    // RESTful API method for Delete operation
	    @DeleteMapping("/categorias/{id}")
	    public void delete(@PathVariable Integer id) {
	        service.delete(id);
	    }
}

