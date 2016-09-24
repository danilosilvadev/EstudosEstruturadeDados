package Stacks;

/**
 * Created by sg-0036936 on 24/09/2016.
 */
public class Pilha<T> extends EstruturaEstatica<T>{

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
    }

    //empilha mais um elemento
    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    //Verifica o elemento no topo da pilha
    public T topo(){

        if (this.estaVazia()){
            //se executar o if ele já retorna
            // com null sem passar pela linha fora do if
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha(){

        if (this.estaVazia()){
            //se executar o if ele já retorna
            // com null sem passar pela linha fora do if
            return null;
        }
        //Aqui simplifiquei  tamanho tirando 1 dele e ao mesmo
        // tempo passando tamanho -1 que é a posição correta.
        return this.elementos[--tamanho];
    }

}
