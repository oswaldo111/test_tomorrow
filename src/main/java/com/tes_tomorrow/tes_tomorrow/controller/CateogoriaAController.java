package com.tes_tomorrow.tes_tomorrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tes_tomorrow.tes_tomorrow.models.CategoriaA;
import com.tes_tomorrow.tes_tomorrow.service.CategoriaAService;

@Controller
@RequestMapping("categoria")
public class CateogoriaAController {


    @Autowired
    private CategoriaAService categoriaAService;

      @GetMapping()
    public String listar(Model model) {
        model.addAttribute("categoria", categoriaAService.listarcategoria());
        return "categoria/categoria-list";
    }

    @GetMapping("nuevo")
    public String ShowNewcategoria(Model model) {
        model.addAttribute("categoria", new CategoriaA());
        return "categoria/categoria-form";
    }

    @PostMapping
    public String Savecategoria(CategoriaA categoriaooucr) {
        categoriaAService.guardar(categoriaooucr);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String ShowEditcategoria(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoriaAService.ObtenerPorId(id));
        return "categoria/categoria-form";
    }

    @GetMapping("/eliminar/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        categoriaAService.eliminar(id);
        return "redirect:/categoria";
    }
}
