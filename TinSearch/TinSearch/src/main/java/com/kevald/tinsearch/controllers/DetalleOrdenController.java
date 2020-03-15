package com.kevald.tinsearch.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.kevald.tinsearch.models.entities.DetalleOrden;
import com.kevald.tinsearch.models.services.DetalleOrdenService;


@RestController
public class DetalleOrdenController {

	@Autowired
    private DetalleOrdenService service;
	
	@GetMapping("/detalleordenes")
	public List<DetalleOrden> list() {
	    return service.listAll();
    } 
	// RESTful API methods for Retrieval operations
	    @GetMapping("/detalleordenes/{id}")
	    public ResponseEntity<DetalleOrden> get(@PathVariable Integer id) {
	        try {
	        	DetalleOrden detalleordenes = service.get(id);
	            return new ResponseEntity<DetalleOrden>(detalleordenes, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<DetalleOrden>(HttpStatus.NOT_FOUND);
	        }      
	    }
     
    // RESTful API method for Create operation
     
	    @PostMapping("/DetalleOrdenes")
	    public void add(@RequestBody DetalleOrden product) {
	        service.save(product);
	    }
    // RESTful API method for Update operation
	    @PutMapping("/DetalleOrdenes/{id}")
	    public ResponseEntity<?> update(@RequestBody DetalleOrden detalleOrdenes, 
	    		@PathVariable Integer id) {
	        try {
	        	DetalleOrden existDetalleOrden = service.get(id);
	            service.save(detalleOrdenes);
	            
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }      
	    }
     
    // RESTful API method for Delete operation
	    @DeleteMapping("/DetalleOrdenes/{id}")
	    public void delete(@PathVariable Integer id) {
	        service.delete(id);
	    }
}

