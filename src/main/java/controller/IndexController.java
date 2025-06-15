/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package controller;

import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.CategoriaService;

/**
 *
 * @author girlsword
 */
@Controller
@ResquestMapping("/categoria")
public class IndexController {
    @Autowired
     CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Categoria> categorias = categoriaService.getCategories(false);
        model.addAttribute("categorias",categorias);
        model.addAttribute("TotalCategorias",categorias.size());
        return "/categoria/listado";
    }
    
}
    