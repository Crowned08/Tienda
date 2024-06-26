
package com.Tienda_k.demo.service.impl;

import com.Tienda_k.demo.dao.CategoriaDao;
import com.Tienda_k.demo.domain.Categoria;
import com.Tienda_k.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activo) {
        var lista = categoriaDao.findAll();
        
        if(activo){//solo activos...
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
    
    
}
