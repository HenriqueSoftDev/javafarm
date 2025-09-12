package br.com.joaocarloslima;

public class Cenoura {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

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

}
