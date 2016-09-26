package Queues;

/**
 * Created by sg-0036936 on 26/09/2016.
 */
public class Main {

    public static void main(String[] args){

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);

        FilaPrioritaria<Paciente> filaPrioritaria = new FilaPrioritaria<>();

        //Como argumento passei um obj anônimo para q os
        //dados de Paciente sejam usados.
        filaPrioritaria.enfileira(new Paciente(5, "Sid"));
        filaPrioritaria.enfileira(new Paciente(3, "Max"));
        filaPrioritaria.enfileira(new Paciente(1, "Olic"));

        System.out.println(filaPrioritaria);

    }

}
