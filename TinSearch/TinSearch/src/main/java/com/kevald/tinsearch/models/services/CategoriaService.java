package com.kevald.tinsearch.models.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevald.tinsearch.CaterogiaRepository;
import com.kevald.tinsearch.models.entities.Categoria;

@Service
@Transactional
public class CategoriaService {
	
	@Autowired
	private CaterogiaRepository repo;
	
	public List<Categoria> listAll() {
        return repo.findAll();
    }
     
    public void save(Categoria categoria) {
        repo.save(categoria);
    }
     
    public Categoria get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}


