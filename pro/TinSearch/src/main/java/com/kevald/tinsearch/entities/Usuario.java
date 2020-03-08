package com.kevald.tinsearch.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="user_name")
	@NotEmpty
	private String primerNombre;
	
	@Column (name="user_last")
	private String primerApellido;
	
	@Temporal (TemporalType.DATE)
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@Column (name="correo")
	private String correo;
	
	@Column (name="contraseña")
	@NotEmpty
	private String Contraseña;
	
	@Column (name="direccion_casa")
	@NotEmpty
	private String direccion;
	
	@Column (name="telefono")
	private int Telefono;
	

}