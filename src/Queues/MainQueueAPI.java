package Queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by sg-0036936 on 26/09/2016.
 */
/*OVERVIEW
* API Queue do java
* */

public class MainQueueAPI {

    public static void main(String[] args){

        /*Como Queue é um interface não podemos
        * instanciála direto, precisamos então
        * instanciar uma classe que implementa ela
        * e fazemos ela do tipo Queue em vez de
        * começar com LinkedList pra assegurar
        * que os atributos que eu use do LikedList
        * Sejam apenas os atributos que ele implmenta
        * em Queue*/
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); //Equivale ao enfileira()
        fila.add(2);
        fila.add(3);
        fila.add(4);

        System.out.println(fila.peek()); //espiar()
        System.out.println(fila.remove()); //Desenfileirar()
        System.out.println(fila);

        //Fila com prioridade
        Queue<Paciente> prioritaria = new PriorityQueue<>();

        prioritaria.add(new Paciente(2,"jemma"));
        prioritaria.add(new Paciente(1, "Jack Rymes"));
        prioritaria.add(new Paciente(3, "Vikka"));

        System.out.println(prioritaria);
    }

}
