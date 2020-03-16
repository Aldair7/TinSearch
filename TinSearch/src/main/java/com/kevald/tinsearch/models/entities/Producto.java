package com.kevald.tinsearch.models.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="productos")
public class Producto {
	
	private Integer id;
	
	@Column (name="nombre_pro")
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

	
	public Producto() {
	}

	public Producto(Integer id, String nombreProducto, String descripcionProducto, int precioUnidad, int tags,
			String marca, String foto, String stock) {
		super();
		this.id = id;
		this.NombreProducto = nombreProducto;
		this.DescripcionProducto = descripcionProducto;
		this.PrecioUnidad = precioUnidad;
		this.Tags = tags;
		this.Marca = marca;
		this.Foto = foto;
		this.Stock = stock;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return DescripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		DescripcionProducto = descripcionProducto;
	}

	public int getPrecioUnidad() {
		return PrecioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		PrecioUnidad = precioUnidad;
	}

	public int getTags() {
		return Tags;
	}

	public void setTags(int tags) {
		Tags = tags;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getFoto() {
		return Foto;
	}

	public void setFoto(String foto) {
		Foto = foto;
	}

	public String getStock() {
		return Stock;
	}

	public void setStock(String stock) {
		Stock = stock;
	}
	
	
}
