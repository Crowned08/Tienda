
package com.Tienda_k.demo.dao;

import com.Tienda_k.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario,Long>{
    public Usuario findByUsername(String username);
   
}
