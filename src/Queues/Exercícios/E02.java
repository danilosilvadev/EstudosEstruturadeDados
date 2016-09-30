package Queues.Exercícios;

import java.util.LinkedList;
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

        String pessoas = adiciona();
        System.out.println(pessoas);

    }

    public static String adiciona() {

        //Criar duas listas Queues normais uma
        // prioritária e outra normal e por os obj1 e obj2 aqui dentro

        Queue<Prioritarios> prioritarios = new LinkedList<>();
        Queue<Normais> normais = new LinkedList<>();

        prioritarios.add(new Prioritarios("Vikka"));
        normais.add(new Normais("Jemma"));
        normais.add(new Normais("Sid"));
        prioritarios.add(new Prioritarios("Ayunsabah"));
        prioritarios.add(new Prioritarios("Olic"));
        normais.add(new Normais("Jack Rymes"));
        prioritarios.add(new Prioritarios("Rudy"));
        prioritarios.add(new Prioritarios("Husky"));

        int contador;

        //prioritarios.addAll(normais);

        for (contador = 0; contador <= 4; contador++) {
            if (prioritarios.size() != 0 && contador <= 3){
                prioritarios.add(new Prioritarios());
                System.out.println(prioritarios);
            } else if(normais.size() != 0){
                normais.add(new Normais());
                contador = 0;
                System.out.println(normais);

            } else {

                System.out.println("A fila acabou.");

                }
        }

        return null;
    }
}

