package Queues;

/**
 * Created by sg-0036936 on 26/09/2016.
 */
public class FilaPrioritaria<T> extends Fila<T>{

    public void enfileira(T elemento){

        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i=0; i<this.tamanho; i++){
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento);
    }

}