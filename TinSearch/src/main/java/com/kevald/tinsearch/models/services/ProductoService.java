package com.kevald.tinsearch.models.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevald.tinsearch.ProductoRepository;
import com.kevald.tinsearch.models.entities.Producto;

@Service
@Transactional
public class ProductoService {

	@Autowired
	private ProductoRepository repo;
	
	public List<Producto> listAll() {
        return repo.findAll();
    }
     
    public void save(Producto productos) {
        repo.save(productos);
    }
     
    public Producto get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
