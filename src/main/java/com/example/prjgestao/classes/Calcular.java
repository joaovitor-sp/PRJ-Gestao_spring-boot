package com.example.prjgestao.classes;

public class Calcular {

    public static double calcularTdp(double tdpProcessador, double tdpPlacaDeVideo) {
        double resultado = 0;
        resultado = tdpProcessador + tdpPlacaDeVideo + 200;
        return resultado;
    }

    public static double calcularPreco(double precoProcessador, double precoPlacaDeVideo){

        double resultado = 0;
        resultado = precoProcessador + precoPlacaDeVideo + 250;
        return resultado;
    }

}
