package br.com.joaocarloslima;

public class Cenoura {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    //Getters
    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    //Setters
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setTempoDeVida(int tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public void setTempoDeCrescimento(int tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    //Constructor
    public Cenoura(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    //Métodos
    public void crescer() {

        tempoDeVida++;

        if (tempoDeVida == tempoDeCrescimento) {
            if (tamanho < 4) {
                tamanho++;
            }
            tempoDeCrescimento += tempoDeCrescimento;
        }

    }

    public boolean podeColher() {
        if (tamanho == 4) {
            return true;
        }
        return false;
    }

    public String getImage() {
        return "images/cenoura" + "tamanho" + ".png";
    }

}
