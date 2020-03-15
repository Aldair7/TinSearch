package com.kevald.tinsearch;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kevald.tinsearch.models.entities.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Integer>  {

}
