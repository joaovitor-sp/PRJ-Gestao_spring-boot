package com.example.prjgestao.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularTest {

    ListaProdutos listaProdutos = new ListaProdutos();

    @Test
    void calcularTdp() {

        // Recomendando a fonte a partir da soma dos tdp's da placa de vídeo e processador mais baratos e incremetando 250W.
        Assertions.assertEquals(545, Calcular.calcularTdp(listaProdutos.listaProcessadores.get(0).getTdp(), listaProdutos.listaPlacaDeVideos.get(6).getTdp()));
    }

    @Test
    void calcularPreco() {

        // Combinando o preço do processador e da placa de vídeo escolhidos
        Assertions.assertEquals(5200, Calcular.calcularPreco(listaProdutos.listaProcessadores.get(0).getCusto(), listaProdutos.listaPlacaDeVideos.get(6).getPreco()));

    }
}