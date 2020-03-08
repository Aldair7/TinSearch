package com.kevald.tinsearch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="tipo")
	@NotEmpty
	private String Tipo;
	
	@Column (name="rango")
	@NotEmpty
	private String Rango;
	
	@Column (name="activo")
	@NotEmpty
	private String Activo;
	
	@Column (name="utilidad")
	@NotEmpty
	private String Utilidad;
	
	@Column (name="gama")
	@NotEmpty
	private String Gama;
	
	@Column (name="utilidad2")
	@NotEmpty
	private String Utilidad2;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", nullable=false)
	private Productos producto;
}