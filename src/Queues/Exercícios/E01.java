package Queues.Exercícios;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sg-0036936 on 26/09/2016.
 */

/*OVERVIEW
*Usando a estrutura de dados Fila, crie uma fila de
* documentos que precisam ser impressos. Cada
documento é composto de um nome e quantidade de
folhas a serem impressas. O programa deve:
- Enfileirar os documentos;
- E seguindo a ordem, o programa deve “imprimir”
cada documento, desenfileirando da fila. Se
desejar pode usar Threads para esperar a
impressão de acordo com o número
de folhas a serem impressas.
* */

public class E01 {

    public static void main(String[] args) {

        Queue<Documento> documentos = new LinkedList<>();

        documentos.add(new Documento("Sid", 54));
        documentos.add(new Documento("Jemma", 42));
        documentos.add(new Documento("Desmond", 10));

        System.out.println(documentos);

        System.out.println(documentos.remove());
        System.out.println(documentos.remove());
        System.out.println(documentos.remove());



    }
}
