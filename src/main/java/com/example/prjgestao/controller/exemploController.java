package com.example.prjgestao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjgestao.classes.ListaProdutos;
import com.example.prjgestao.classes.PlacaDeVideo;



@RestController
@RequestMapping("/exemplo")
public class exemploController {

    private final ListaProdutos listaProdutos;

    public exemploController(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @PostMapping("/dados")
    public ListaProdutos exemplo(@RequestBody Map<String, String> argumentos) {
        String placaDeVideo = argumentos.get("placaDeVideo"); 
        String processador = argumentos.get("processador");

        List<PlacaDeVideo> listaPlacasDeVideo = listaProdutos.getListaPlacaDeVideos();
        for(PlacaDeVideo listPlacaDeVideo : listaPlacasDeVideo) {
            
        }

        return listaProdutos;
    }
    
    
}
