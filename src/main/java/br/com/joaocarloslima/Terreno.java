package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batataP){
        batata = batataP;
    }
    public void plantar(Cenoura cenouraP){
        cenoura = cenouraP;
    }
    public void plantar(Morango morangoP){
        morango = morangoP;
    }

    public void colher(Celeiro celeiro){
        if (batata != null && batata.podeColher()){
            batata = null;
            celeiro.armazenaBatata();
        }
        if (cenoura != null && cenoura.podeColher()){
            cenoura = null;
            celeiro.armazenaCenoura();
        }
        if (morango != null && morango.podeColher()){
            morango = null;
            celeiro.armazenaMorango();
        }
    }

    public boolean estaOcupado(){
        return batata != null || cenoura != null || morango != null;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
