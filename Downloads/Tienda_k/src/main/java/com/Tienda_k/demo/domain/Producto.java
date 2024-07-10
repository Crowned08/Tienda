
package com.Tienda_k.demo.domain;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="producto")
public class Producto {
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
   // private Long idCategoria; no se usa por el ManyToOne
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
}
