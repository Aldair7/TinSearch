package com.kevald.tinsearch;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kevald.tinsearch.models.entities.Categoria;

public interface CaterogiaRepository  extends JpaRepository<Categoria, Integer>  {

}
