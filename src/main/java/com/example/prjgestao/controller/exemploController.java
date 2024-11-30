package com.example.prjgestao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjgestao.classes.ListaProdutos;



@RestController
@RequestMapping("/exemplo")
public class exemploController {

    private final ListaProdutos listaProdutos;

    public exemploController(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @GetMapping("/dados")
    public ListaProdutos exemplo() {
        return listaProdutos;
    }
    
    
}
