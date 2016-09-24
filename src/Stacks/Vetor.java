package Stacks;

/**
 * Created by sg-0036936 on 24/09/2016.
 */
public class Vetor<T> extends EstruturaEstatica<T> {

    public Vetor() {
        super();
    }

    public Vetor(int capacidade) {
        super(capacidade);
    }

    //Método que adiciona
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
    //Método que adiciona numa certa posição
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}
