package br.com.joaocarloslima;

public class Batata {

    private int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 3;

    public Batata(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(int tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    public void setTempoDeCrescimento(int tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer(){
        tempoDeVida++;

        if(tempoDeVida == tempoDeCrescimento){
            if (tamanho < 4){
                tamanho++;
            }
            tempoDeCrescimento += tempoDeCrescimento;
        }
    }
    public boolean podeColher(){
        if (tamanho == 4) {
            return true;
        }
        return false;
    }
    public String getImagem(){
        return "images/batata" + tamanho + ".png";
    }
}
