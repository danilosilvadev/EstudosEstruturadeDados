package Stacks.Exercícios;

import Stacks.Pilha;

import java.util.Scanner;

/**
 * Created by sg-0036936 on 25/09/2016.
 */

/*
* Escreva um programa que verifique se
* o que eu digitei é palíndromo.
*
* */

public class E03 {


    public static void main(String[] args) {

        String letra;
        Scanner scanner = new Scanner(System.in);
        letra = scanner.nextLine();
        criarPilha(letra);

    }

    public static boolean criarPilha(String letra) {

        Pilha<String> pilha = new Pilha<String>(letra.length());

        String letraContrario = reverseIt(letra);

        if (letra.equals(letraContrario)) {
            System.out.println("Sim");
            return true;
        }

        System.out.println("Não");
        return false;
    }

    public static String reverseIt(String letra) {
        int i, len = letra.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(letra.charAt(i));
        }

        return dest.toString();
    }
}
