package Stacks.Exercícios;

import Stacks.Pilha;

import java.util.Scanner;

/**
 * Created by sg-0036936 on 24/09/2016.
 */

/* OVERVIEW
* Escreva um programa que leia 10 números. Para cada número
* lido verifique e codifique de acordo com as regras a seguir:
A - Se o número for par, empilhe na pilha.
B - Se o número for ímpar, desimpilhe um
número da pilha. Caso a pilha esteja vazia, mostre uma mensagem.
C - Se ao final do programa a pilha não estiver vazia,
desempilhe todos os elementos imprimindo-os na tela.
*
* */

public class E01 {

    Pilha<Integer> pilha = new Pilha<Integer>();

    public static void main(String[] args) {

        numeros();

    }

    public static void numeros() {

        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);

        int numero;

        for (int i = 1; i < 11; i++) {

            System.out.println("Escreva o " + i + "º número.");
            numero = scanner.nextInt();
            if ((numero % 2) == 0) {
                pilha.empilha(numero);
            } else if (pilha.tamanho() == 0) {
                System.out.println("A pilha está vazia.");
            } else {
                pilha.desempilha();
            }
        }
        if (pilha.tamanho() != 0){
            System.out.println(pilha);
            pilha.limpar();

        }
    }


}
