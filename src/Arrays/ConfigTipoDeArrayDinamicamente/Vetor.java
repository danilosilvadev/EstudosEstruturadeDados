package Arrays.ConfigTipoDeArrayDinamicamente;

/**
 * Created by sg-0036936 on 22/09/2016.
 */

/*O símbolo Diamond "<>" é chamado de generics e ele chama a classe "T(type)"
    o que restringe a incrementação do vetor a um certo tipo
    de elemento que queiramos que tenha acesso, semelhante ao arraylist. */
public class Vetor<T> {

    private T[] elementos;
    private int tamanho;


    public Vetor(int capacidade) {
        //Nessa parte adicionamos (T[]) que faz o cast convertendo tipo Object em T(subclasse).
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;

    }

    //Daqui por diante é só substituir tudo que teria Object ou String etc, por T.

    //Método que adiciona elemento
    public boolean adiciona(T elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    //Método overload que move os itens do array para a posição seguinte abrindo espaço
    public boolean adiciona(int posicao, T elemento) {

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
    }

    //Aumentar a capacidade de um array
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            //Novamente um cast na classe Object.
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Bloco que busca elemento sem saber a posição
    public int busca(T elemento) {
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
