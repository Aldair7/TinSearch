package com.kevald.tinsearch.models.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevald.tinsearch.UsuarioRepository;
import com.kevald.tinsearch.models.entities.Usuario;

@Service
@Transactional
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listAll() {
        return repo.findAll();
    }
     
    public void save(Usuario usuario) {
        repo.save(usuario);
    }
     
    public Usuario get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
