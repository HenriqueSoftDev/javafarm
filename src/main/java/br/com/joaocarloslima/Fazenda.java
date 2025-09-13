package br.com.joaocarloslima;

import java.util.List;

public class Fazenda {

    private List<Terreno> terreno;
    private Celeiro celeiro;

    public Fazenda() {
        for (int x = 0; x <= 13; x++) {
            for (int y = 0; y <= 13; y++) {
                terreno.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) {
        if (celeiro.getQtdeBatatas() > 0) {
            Terreno batata = getTerrenos(x, y);
            batata.plantar(new Batata());
            celeiro.consumirBatata();
        }
    }

    public void plantarCenoura(int x, int y) {
        if (celeiro.getQtdeCenouras() > 0) {
            Terreno cenoura = getTerrenos(x, y);
            cenoura.plantar(new Cenoura());
            celeiro.consumirCenoura();
        }
    }

    public void plantarMorango(int x, int y) {
        if (celeiro.getQtdeMorangos() > 0) {
            Terreno morango = getTerrenos(x, y);
            morango.plantar(new Morango());
            celeiro.consumirMorango();
        }
    }

    public Terreno getTerrenos(int x, int y) {
        for (int i = 0; i < terreno.size(); i++) {
            Terreno tPosicionado = terreno.get(i);
            if (x == tPosicionado.getX() && y == tPosicionado.getY()) {
                return tPosicionado;
            }
        }
        return null;
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}
