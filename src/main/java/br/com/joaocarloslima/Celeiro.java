package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

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

    //Métodos de armazenamento
    public void armazenaBatata(){
        if (capacidade)
        qtdeBatatas += 2;
        capacidade += 2;
    }

    public void armazenaCenoura(){
        qtdeCenouras += 2;
        capacidade += 2;
    }

    public void armazenaMorango(){
        qtdeMorangos++;
        capacidade += 2;
    }

    //Métodos de consumo dos produtos
    public void consumirBatata(){
        qtdeBatatas--;
    }

    public void consumirCenoura(){
        qtdeCenouras--;
    }
    public void consumirMorango(){
        qtdeMorangos--;
    }

    //
    public int getEspacoDisponivel(){

    }

    public int getOcupacao(){

    }

    public boolean celeiroCheio(){

    }

}
