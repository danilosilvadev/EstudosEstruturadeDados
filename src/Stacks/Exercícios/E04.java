package Stacks.Exercícios;

import Stacks.Pilha;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sg-0036936 on 25/09/2016.
 */

/*OVERVIEW
* Crie um código que converta
* um número fornecido pelo usuário
* em código binário(0=num com divisao
 *exata por dois e 1 = o resto.
* */


public class E04 {

    public static void main(String[] args){

    criarPilha();

}

    public static int criarPilha() {

        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;

        for (int i=0; i < 6; i++) {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            stack.push(num);

            if ((num % 2) == 0) {
                stack.pop();
                stack.push(0);
            } else {
                stack.pop();
                stack.push(1);
            }
        }

            System.out.println(stack);
            return num;

    }


}
