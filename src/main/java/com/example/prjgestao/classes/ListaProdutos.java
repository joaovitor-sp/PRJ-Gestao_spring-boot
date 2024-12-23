package com.example.prjgestao.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListaProdutos {

    List<Processador> listaProcessadores;
    List<PlacaMae> listaPlacasMae;
    List<PlacaDeVideo> listaPlacaDeVideos;

    public List<PlacaDeVideo> getListaPlacaDeVideos() {
        return listaPlacaDeVideos;
    }

    public List<Processador> getListaProcessadores() {
        return listaProcessadores;
    }

    public List<PlacaMae> getListaPlacasMae() {
        return listaPlacasMae;
    }

    public ListaProdutos() {
        this.listaProcessadores = new ArrayList<>();
        this.listaPlacasMae = new ArrayList<>();
        this.listaPlacaDeVideos = new ArrayList<>();
        listarProdutos();  
    }

    public void listarProdutos(){
        listaProcessadores.add(new Processador(1, "AMD", "Ryzen 5 9600X", "AM5", 2000, 65));
        listaProcessadores.add(new Processador(2, "AMD", "Ryzen 7 9700X", "AM5", 2500, 65));
        listaProcessadores.add(new Processador(3, "AMD", "Ryzen 7 9800X3D", "AM5", 4200, 120));
        listaProcessadores.add(new Processador(4, "AMD", "Ryzen 9 9900X", "AM5", 3200, 120));
        listaProcessadores.add(new Processador(5, "AMD", "Ryzen 9 9950X", "AM5", 4800, 170));
        listaProcessadores.add(new Processador(6, "Intel", "Intel Core i3 14100", "LGA 1700", 620, 60));
        listaProcessadores.add(new Processador(7, "Intel", "Intel Core i3 14400", "LGA 1700", 1230, 65));
        listaProcessadores.add(new Processador(8, "Intel", "Intel Core i5-14600K", "LGA 1700", 2000, 125));
        listaProcessadores.add(new Processador(9, "Intel", "Intel Core i7-14700K", "LGA 1700", 2800, 125));
        listaProcessadores.add(new Processador(10, "Intel", "Intel Core i9-14900K", "LGA 1700", 3800, 125));

        listaPlacasMae.add(new PlacaMae(1, "A620M","AM5", 630));
        listaPlacasMae.add(new PlacaMae(2, "B650M","AM5", 900));
        listaPlacasMae.add(new PlacaMae(3, "X6700M","AM5", 2000));
        listaPlacasMae.add(new PlacaMae(4, "H610M","LGA 1700", 520));
        listaPlacasMae.add(new PlacaMae(5, "B760M","LGA 1700", 700));
        listaPlacasMae.add(new PlacaMae(6, "Z620M","LGA 1700", 1900));

        listaPlacaDeVideos.add(new PlacaDeVideo(1, "NVIDIA","GeForce RTX 4090", 450, 11000));
        listaPlacaDeVideos.add(new PlacaDeVideo(2, "NVIDIA","GeForce RTX 4050", 420,9000));
        listaPlacaDeVideos.add(new PlacaDeVideo(3, "NVIDIA","GeForce RTX 4070 TI", 220,4000));
        listaPlacaDeVideos.add(new PlacaDeVideo(4, "NVIDIA","GeForce RTX 4060 TI",165, 2400));
        listaPlacaDeVideos.add(new PlacaDeVideo(5, "AMD","Radeon RX 7900 XTX", 300, 6000));
        listaPlacaDeVideos.add(new PlacaDeVideo(6, "AMD","Radeon RX 7900 XT", 260, 4000));
        listaPlacaDeVideos.add(new PlacaDeVideo(7, "AMD","Radeon RX 7700 XT", 230, 3200));
        listaPlacaDeVideos.add(new PlacaDeVideo(7, "AMD","Radeon RX 7600", 230, 3200));


    }
    
}
