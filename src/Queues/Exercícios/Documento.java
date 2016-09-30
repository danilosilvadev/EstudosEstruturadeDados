package Queues.Exercícios;

import org.jetbrains.annotations.NotNull;

/**
 * Created by sg-0036936 on 26/09/2016.
 */
public class Documento {

    private String nome;
    private int folhas;
    private int prioridade;
    int senhaNormal;
    String senhaPrioritaria;

    public Documento(int prioridade, String nome) {
        this.nome = nome;
        this.folhas = folhas;
        this.prioridade = prioridade;
    }

    public Documento(String nome, int folhas) {
        this.nome = nome;
        this.folhas = folhas;
        this.prioridade = prioridade;
    }

    public Documento(int senhaNormal){ this.senhaNormal = senhaNormal; }

    public Documento(String senhaPrioritaria){
        this.senhaPrioritaria = senhaPrioritaria;
    }

    public Documento(){}

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", folhas=" + folhas +
                '}';
    }

    /*@Override
    public int compareTo(@NotNull Documento o) {
        //obj1 > obj2 retorna > 0 (1)
        //ojb1 < obj2 retorna < 0 (-1)

        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        }

        return 0;
    }*/

}

