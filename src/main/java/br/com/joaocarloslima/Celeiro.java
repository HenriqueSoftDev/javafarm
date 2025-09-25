package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade = 50;
    private int qtdeBatatas = 10;
    private int qtdeCenouras = 10;
    private int qtdeMorangos = 10;

    //Métodos de armazenamento
    public void armazenaBatata() {
        if (celeiroCheio()) {
            throw new RuntimeException("Não foi possível armazenar batatas.. O celeiro está cheio!");
        }
        qtdeBatatas += 2;
    }

    public void armazenaCenoura() {
        if (celeiroCheio()) {
            throw new RuntimeException("Não foi possível armazenar cenouras.. O celeiro está cheio!");
        }
        qtdeCenouras += 2;

    }

    public void armazenaMorango() {
        if (celeiroCheio()) {
            throw new RuntimeException("Não foi possível armazenar cenouras.. O celeiro está cheio!");
        }
        qtdeMorangos += 2;
    }

    //Métodos de consumo dos produtos
    public void consumirBatata() {
        if (qtdeBatatas <= 0) {
            throw new RuntimeException("Não há mais batatas para consumir..");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras <= 0) {
            throw new RuntimeException("Não há mais cenouras para consumir..");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos <= 0) {
            throw new RuntimeException("Não há mais morangos para consumir..");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeMorangos + qtdeCenouras);
    }

    public double getOcupacao() {
        return (double) (qtdeMorangos + qtdeCenouras + qtdeBatatas) / capacidade;
    }

    public boolean celeiroCheio() {
        return getOcupacao() == getEspacoDisponivel();
    }

    //Getters
    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

}
