package com.kevald.tinsearch;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kevald.tinsearch.models.entities.DetalleOrden;

public interface DetalleOrdenRepository  extends JpaRepository<DetalleOrden, Integer>  {

}
