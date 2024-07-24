
package com.Tienda_k.demo.domain;
import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="rol")
public class Rol {
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rol")
    private Long idRol;
    private String nombre;
    @Column(name="id_usuario")
    private Long idUsuario;
}
