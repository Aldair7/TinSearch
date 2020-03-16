package com.kevald.tinsearch.models.entities;

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
public class DetalleOrden {

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
	
	
	@Temporal (TemporalType.DATE)
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", nullable=false)
	private Categoria producto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id", nullable=false)
	private Categoria usuario;

	
	
	public DetalleOrden() {
	}
	public DetalleOrden(Long id, @NotEmpty int numeroOrden, @NotEmpty int precio, @NotEmpty int cantidad,
			@NotEmpty int descuento, Date fechaNacimiento, Categoria producto, Categoria usuario) {
		this.id = id;
		this.NumeroOrden = numeroOrden;
		this.Precio = precio;
		this.Cantidad = cantidad;
		this.Descuento = descuento;
		this.fechaNacimiento = fechaNacimiento;
		this.producto = producto;
		this.usuario = usuario;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroOrden() {
		return NumeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		NumeroOrden = numeroOrden;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getDescuento() {
		return Descuento;
	}

	public void setDescuento(int descuento) {
		Descuento = descuento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Categoria getProducto() {
		return producto;
	}

	public void setProducto(Categoria producto) {
		this.producto = producto;
	}

	public Categoria getUsuario() {
		return usuario;
	}

	public void setUsuario(Categoria usuario) {
		this.usuario = usuario;
	}
	
	
}
