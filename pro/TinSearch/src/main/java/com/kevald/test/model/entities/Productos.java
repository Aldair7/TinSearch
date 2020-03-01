package com.kevald.test.model.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name="productos")
public class Productos  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="nombre_pro")
	@NotEmpty
	private String NombreProducto;
	
	@Column (name="descri_pro")
	private String DescripcionProducto;
	
	@Column (name="precio_uni")
	private String PrecioUnidad;
	
	@Column (name="tags_id")
	private String Tags;
	
	@Column (name="marca")
	private String Marca;
	
	@Column (name="foto")
	private String Foto;
	
	@Column (name="stock")
	private String Stock;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable=false)
	private Categorias categoria;

}
