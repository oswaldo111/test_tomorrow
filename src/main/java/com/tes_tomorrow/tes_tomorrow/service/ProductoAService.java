package com.tes_tomorrow.tes_tomorrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.tes_tomorrow.tes_tomorrow.models.ProductoA;
import com.tes_tomorrow.tes_tomorrow.repository.ProductoARepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class ProductoAService {

    @Autowired
    private ProductoARepository productoARepository;

     public List<ProductoA> listarcategoria(){
        return productoARepository.findAll();
    }

    public ProductoA guardar(ProductoA ProductoA){
        return productoARepository.save(ProductoA);
    }

    public ProductoA ObtenerPorId(Long id){
        return productoARepository.findById(id).orElse(null);
    }

    public void eliminar (Long id){
        productoARepository.deleteById(id);
    }

}
