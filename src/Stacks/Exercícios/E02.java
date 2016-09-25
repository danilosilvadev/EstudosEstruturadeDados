package Stacks.Exercícios;

import Stacks.Pilha;

import java.util.Scanner;

/**
 * Created by sg-0036936 on 24/09/2016.
 */

/* OVERVIEW
* Escreva um programa que leia 10 números. Para cada número
* lido verifique e codifique de acordo com as regras a seguir:
A - Se o número for par, empilhe na pilha1.
B - Se o número for ímpar, empilhe na pilha2.
C - Se o número for (0), desempilhe um elemento de cada pilha.
Caso alguma pilha esteja vazia, mostre uma msg de erro na tela.
Ao final do programa desempilhe todos os elementos
das duas pilhas e os imprima na tela.
*
* */

public class E02 {

    Pilha<Integer> pilha = new Pilha<Integer>();

    public static void main(String[] args) {

        numeros();

    }

    public static void numeros() {

        Pilha<Integer> pilha1 = new Pilha<Integer>();
        Pilha<Integer> pilha2 = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        int numero;

        for (int i = 1; i < 11; i++) {

            System.out.println("Escreva o " + i + "º número.");
            numero = scanner.nextInt();
            if ((numero % 2) == 0 && numero != 0) {
                pilha1.empilha(numero);
            } else if (numero != 0) {
                pilha2.empilha(numero);
            } else if (pilha1.tamanho() != 0 && pilha2.tamanho() != 0) {
                pilha1.desempilha();
                pilha2.desempilha();
            } else {
                System.out.println("A pilha está vazia.");
            }

        }

        System.out.println(pilha1 + " " + pilha2);
        pilha1.limpar();
        pilha2.limpar();

    }
}



