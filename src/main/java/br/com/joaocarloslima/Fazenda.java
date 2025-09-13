package br.com.joaocarloslima;

import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        for (int x = 0; x <= 13; x++){
            for (int y = 0; y <= 13; y++)
            {
                terrenos.add(new Terreno(x,y));
            }
        }
    }

    public plantarBatata(int x, int y){
        if (celeiro.getQtdeBatatas()){

        }
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}
