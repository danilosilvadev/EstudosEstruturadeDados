package Queues;

/**
 * Created by sg-0036936 on 24/09/2016.
 */
public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
    }

    //empilha mais um elemento
    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    //Verifica o elemento no topo da pilha
    public T espia() {

        if (this.estaVazia()) {
            //se executar o if ele já retorna
            // com null sem passar pela linha fora do if
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() {

        if (this.estaVazia()) {
            //se executar o if ele já retorna
            // com null sem passar pela linha fora do if
            return null;
        }
        //Aqui simplifiquei  tamanho tirando 1 dele e ao mesmo
        // tempo passando tamanho -1 que é a posição correta.

        T elementoASerRemovido = this.elementos[0];
        this.remove(0);
        return elementoASerRemovido;
    }

}
