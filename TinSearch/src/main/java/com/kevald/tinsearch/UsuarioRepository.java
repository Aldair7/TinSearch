package com.kevald.tinsearch;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kevald.tinsearch.models.entities.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {

}
