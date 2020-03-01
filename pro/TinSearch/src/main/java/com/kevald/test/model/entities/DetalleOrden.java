package com.kevald.test.model.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="detalle_ordenes")
public class DetalleOrden implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="num_ord")
	@NotEmpty
	private Int NumeroOrden;
	
	@Column (name="precio")
	@NotEmpty
	private Int Precio;
	
	@Column (name="cantidad")
	@NotEmpty
	private Int Cantidad;
	
	@Column (name="descuento")
	@NotEmpty
	private Int Descuento;
	
	@Column (name="metodo_pago")
	@NotEmpty
	private Sping MetodoPago;
	
	@Temporal (TemporalType.DATE);
	@DateTimeFormat (pattern="yyyy-MM-dd");
	private Date fechaNacimiento;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", nullable=false)
	private Categorias producto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id", nullable=false)
	private Categorias usuario;
}
