
package com.Tienda_k.demo.dao;

import com.Tienda_k.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto,Long>{

}
