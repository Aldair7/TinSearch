package com.kevald.tinsearch.models.entities;
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
@Table (name="productos")
public class Producto implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int		 id;
	
	@Column (name="nombre_pro")
	@NotEmpty
	private String NombreProducto;
	
	@Column (name="descri_pro")
	private String DescripcionProducto;
	
	@Column (name="precio_uni")
	private int PrecioUnidad;
	
	@Column (name="tags_id")
	private int Tags;
	
	@Column (name="marca")
	private String Marca;
	
	@Column (name="foto")
	private String Foto;
	
	@Column (name="stock")
	private String Stock;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable=false)
	private Categorias categorias;
}
