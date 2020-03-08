package com.kevald.tinsearch.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="detalle_ordenes")
public class DetalleOrden implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="num_ord")
	@NotEmpty
	private int NumeroOrden;
	 
	@Column (name="precio")
	@NotEmpty
	private int Precio;
	
	@Column (name="cantidad")
	@NotEmpty
	private int Cantidad;
	
	@Column (name="descuento")
	@NotEmpty
	private int Descuento;
	
	@Column (name="metodo_pago")
	@NotEmpty
	private String MetodoPago;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable=false)
	private Usuario usuarios;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", nullable=false)
	private Productos producto;
}
