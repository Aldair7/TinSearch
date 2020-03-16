package com.kevald.tinsearch.models.entities;

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
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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
	private String Telefono;

	
	
	public Usuario() {
	}

	public Usuario(Long id, @NotEmpty String primerNombre, String primerApellido, Date fechaNacimiento, String correo,
			@NotEmpty String contraseña, @NotEmpty String direccion, String telefono) {
		this.id = id;
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.Contraseña = contraseña;
		this.direccion = direccion;
		this.Telefono = telefono;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
