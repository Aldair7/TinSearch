package com.kevald.tinsearch.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
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

	
	
	public Categoria() {
	}

	public Categoria(Long id, @NotEmpty String tipo, @NotEmpty String rango, @NotEmpty String activo,
			@NotEmpty String utilidad, @NotEmpty String gama, @NotEmpty String utilidad2) {
		this.id = id;
		this.Tipo = tipo;
		this.Rango = rango;
		this.Activo = activo;
		this.Utilidad = utilidad;
		this.Gama = gama;
		this.Utilidad2 = utilidad2;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public String getActivo() {
		return Activo;
	}

	public void setActivo(String activo) {
		Activo = activo;
	}

	public String getUtilidad() {
		return Utilidad;
	}

	public void setUtilidad(String utilidad) {
		Utilidad = utilidad;
	}

	public String getGama() {
		return Gama;
	}

	public void setGama(String gama) {
		Gama = gama;
	}

	public String getUtilidad2() {
		return Utilidad2;
	}

	public void setUtilidad2(String utilidad2) {
		Utilidad2 = utilidad2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
