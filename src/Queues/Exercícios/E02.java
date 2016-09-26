package Queues.Exercícios;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by sg-0036936 on 26/09/2016.
 */

/*Escreva um programa que simule a distribuição de senhas
de atendimento a um grupo de pessoas. Cada
pessoa pode receber uma senha prioritária ou uma senha
normal. O programa deve obedecer os seguintes critérios:
- Existe apenas 1 atendente;
- 1 pessoa com senha normal deve ser atendida a cada 3
 pessoas com senha prioritátia;
- Não havendo prioridades, as pessoas com senha normal
podem ser atendidas.*/

public class E02 {

    public static void main(String[] args) {

        PriorityQueue<Documento> pessoas = new PriorityQueue<>();

        final int prioritaria = 1;
        final int normal = 2;

               pessoas.add(new Documento(prioritaria, "Vikka"));
        pessoas.add(new Documento(normal, "Jemma"));
        pessoas.add(new Documento(normal, "Sid"));
        pessoas.add(new Documento(prioritaria, "Ayunsabah"));
        pessoas.add(new Documento(prioritaria, "Olic"));
        pessoas.add(new Documento(normal, "Sid"));
        pessoas.add(new Documento(prioritaria, "Rudy"));
        pessoas.add(new Documento(prioritaria, "Husky"));

        System.out.println(pessoas);


    }

}
