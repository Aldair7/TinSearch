package com.kevald.test.model.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="usuarios")
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
	
	@Temporal (TemporalType.DATE);
	@DateTimeFormat (pattern="yyyy-MM-dd");
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
	private String Telefono;
	

}