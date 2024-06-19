
package com.Tienda_k.demo.domain;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="categoria")
public class Categoria {
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}
