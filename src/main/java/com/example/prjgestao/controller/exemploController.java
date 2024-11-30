package com.example.prjgestao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.prjgestao.classes.Calcular;
import com.example.prjgestao.classes.Processador;
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
    public Map<String, Object> exemplo(@RequestBody Map<String, String> argumentos) {
        String placaDeVideo = argumentos.get("placaDeVideo"); 
        String processador = argumentos.get("processador");

        double precoGPUescolhida = 0;
        double tdpGPUescolhida = 0;
        double  precoProcessadorEscolhido = 0;
        double tdpProcessadorEscolhido = 0;

        List<PlacaDeVideo> listaPlacasDeVideo = listaProdutos.getListaPlacaDeVideos();
        for(PlacaDeVideo listPlacaDeVideo : listaPlacasDeVideo) {
            if(listPlacaDeVideo.getModelo().equals(placaDeVideo)) {
                precoGPUescolhida = listPlacaDeVideo.getPreco();
                tdpGPUescolhida = listPlacaDeVideo.getTdp();
            }
        }

        List<Processador> listProcessadores = listaProdutos.getListaProcessadores();
        for (Processador listProcessador : listProcessadores) {
            if(listProcessador.getModelo().equals(processador)) {
                precoProcessadorEscolhido = listProcessador.getCusto();
                tdpProcessadorEscolhido = listProcessador.getTdp();
            }
        }

        double precoProduto = Calcular.calcularPreco(precoProcessadorEscolhido, precoGPUescolhida);
        double tdpRecomendado = Calcular.calcularTdp(tdpProcessadorEscolhido, tdpGPUescolhida);

        Map<String, Object> PrecoNTdp = new HashMap<>();
        PrecoNTdp.put("precoProduto", precoProduto);
        PrecoNTdp.put("tdp", tdpRecomendado);
        return PrecoNTdp;

    }
    
    
}
