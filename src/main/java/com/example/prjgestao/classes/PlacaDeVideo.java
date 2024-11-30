package com.example.prjgestao.classes;

public class PlacaDeVideo {

    private int id;
    private String fabricante;
    private String modelo;
    private double tdp;
    private double preco;

    public PlacaDeVideo(int id, String fabricante, String modelo, double tdp, double preco){
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tdp = tdp;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTdp() {
        return tdp;
    }

    public double getPreco() {
        return preco;
    }
    
}
