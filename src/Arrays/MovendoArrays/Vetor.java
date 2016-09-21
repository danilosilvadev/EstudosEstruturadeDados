package Arrays.MovendoArrays;

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

    //Método overload que move os itens do array para a posição seguinte abrindo espaço
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {

            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = tamanho - 1; i >= posicao; i--) {

            this.elementos[i + 1] = this.elementos[i];

        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }


    //Esse método substitui o ponteiro da alocação na memória
    // criado pelo array pela string correspondente dos elementos.
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

}
