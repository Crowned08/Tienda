
package com.Tienda_k.demo.service;

import com.Tienda_k.demo.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //Se recupera la lista de categorias de la tabla "categoria" dentro de un ArrayList
    public List<Categoria>getCategorias(boolean activo);
}
