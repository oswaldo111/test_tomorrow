package com.tes_tomorrow.tes_tomorrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes_tomorrow.tes_tomorrow.models.CategoriaA;
import com.tes_tomorrow.tes_tomorrow.repository.CategoriaARepository;

@Service
public class CategoriaAService {

    @Autowired
    private CategoriaARepository categoriaARepository;

    public List<CategoriaA> listarcategoria(){
        return categoriaARepository.findAll();
    }

    public CategoriaA guardar(CategoriaA CategoriaA){
        return categoriaARepository.save(CategoriaA);
    }

    public CategoriaA ObtenerPorId(Long id){
        return categoriaARepository.findById(id).orElse(null);
    }

    public void eliminar (Long id){
        categoriaARepository.deleteById(id);
    }

}
