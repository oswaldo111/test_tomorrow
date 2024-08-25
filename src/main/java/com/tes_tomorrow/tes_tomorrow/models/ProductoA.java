package com.tes_tomorrow.tes_tomorrow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductoA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreA;

    private double precioA;

    private int existenciaA;
    
    @ManyToOne
    @JoinColumn(name = "producto_categoria")
    private CategoriaA categoriaA;

    public ProductoA() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public double getPrecioA() {
        return precioA;
    }

    public void setPrecioA(double precioA) {
        this.precioA = precioA;
    }

    public int getExistenciaA() {
        return existenciaA;
    }

    public void setExistenciaA(int existenciaA) {
        this.existenciaA = existenciaA;
    }

    public CategoriaA getCategoriaA() {
        return categoriaA;
    }

    public void setCategoriaA(CategoriaA categoriaA) {
        this.categoriaA = categoriaA;
    }

    
}
