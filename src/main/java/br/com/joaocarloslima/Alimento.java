package br.com.joaocarloslima;

//Super classe alimento não pode ser instanciada diretamente
public abstract class Alimento {

    protected int tamanho = 1;
    protected  int tempoDeVida = 1;
    protected  int tempoDeCrescimento;
    protected String nome;

    public Alimento(int tempoDeCrescimento, String nome) {
        this.tempoDeCrescimento = tempoDeCrescimento;
        this.nome = nome;
    }

    public void crescer() {

        tempoDeVida++;
        if (tempoDeVida == tempoDeCrescimento) {
            if (tamanho < 4) {
                tamanho++;
            }
            tempoDeCrescimento += tempoDeCrescimento;
        }

    }

    public boolean podeColher(){
        Celeiro celeiro = new Celeiro();
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/" + nome + tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    public String getNome() {
        return nome;
    }
}
