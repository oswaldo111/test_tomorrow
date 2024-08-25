package com.tes_tomorrow.tes_tomorrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tes_tomorrow.tes_tomorrow.models.ProductoA;
import com.tes_tomorrow.tes_tomorrow.service.CategoriaAService;
import com.tes_tomorrow.tes_tomorrow.service.ProductoAService;

@Controller
@RequestMapping("producto")
public class ProductoAController {

    @Autowired
    private ProductoAService productoAService;

    @Autowired
    private CategoriaAService categoriaAService;

       @GetMapping()
    public String listar(Model model) {
        model.addAttribute("producto", productoAService.listarcategoria());
        
        return "producto/producto-list";
    }

    @GetMapping("nuevo")
    public String ShowNewcategoria(Model model) {
        model.addAttribute("producto", new ProductoA());
        model.addAttribute("categoria", categoriaAService.listarcategoria());
        return "producto/producto-form";
    }

    @PostMapping
    public String Savecategoria(ProductoA categoriaooucr) {
        productoAService.guardar(categoriaooucr);
        return "redirect:/producto";
    }

    @GetMapping("/editar/{id}")
    public String ShowEditcategoria(@PathVariable Long id, Model model) {
        model.addAttribute("producto", productoAService.ObtenerPorId(id));
        model.addAttribute("categoria", categoriaAService.listarcategoria());
        return "producto/producto-form";
    }

    @GetMapping("/eliminar/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        productoAService.eliminar(id);
        return "redirect:/producto";
    }
}
