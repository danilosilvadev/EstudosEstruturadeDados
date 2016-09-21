package Arrays.RemoverElementoDeUmArray;

/**
 * Created by sg-0036936 on 20/09/2016.
 */
public class Vetor {

    private String[] elementos;
    private int tamanho;


    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    //Aqui vai o bloco que remove um elemento na posição i
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {

            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = posicao; i < this.tamanho; i++) {

            this.elementos[i] = this.elementos[i + 1];

        }
        this.tamanho--;
    }

    //2º meio - Bloco que busca elemento sem saber a posição
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //Esse método substitui o ponteiro da alocação na memória
    // criado pelo array pela string correspondente dos elementos.
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
