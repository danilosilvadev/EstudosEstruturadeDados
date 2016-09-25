package Stacks;

/**
 * Created by sg-0036936 on 24/09/2016.
 */
public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;


    public EstruturaEstatica(int capacidade) {
        //Nessa parte adicionamos (T[]) que faz o cast convertendo tipo Object em T(subclasse).
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;

    }

    public EstruturaEstatica() {
        this(10);
    }

    //Método que adiciona
    protected boolean adiciona(T elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    } //Método overload que move os itens do array para a posição seguinte abrindo espaço

    protected boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    } //Aumentar a capacidade de um array

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            //Novamente um cast na classe Object.
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Retorna tamanho
    public int tamanho() {
        return this.tamanho;
    }

    //Verifica se a pilha está vazia
    public boolean estaVazia(){
        return tamanho == 0;
    }

    //Aqui eu limpo td o vetor
    public void limpar() {
        while (this.tamanho > 0) {
            this.tamanho--;
        }
    }

    /*Esse método substitui o ponteiro da alocação na memória
    criado pelo array pela string correspondente dos elementos. */

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
