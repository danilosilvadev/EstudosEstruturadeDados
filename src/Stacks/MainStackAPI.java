package Stacks;

import java.util.Stack;

/**
 * Created by sg-0036936 on 24/09/2016.
 */
public class MainStackAPI {

    public static void main(String[] args){

    //Stack manual que criamos
    Pilha<Integer> pilha = new Pilha<>();
    //Stack API do java
    Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        //Adiciona um elemento ao topo da pilha,
        // equivalente ao nosso empilha();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Verifica se está vazia, equivalente ao nosso estaVazia();
        System.out.println(stack.isEmpty());
        //Verifica o tamanho da pilha, equivalente ao nosso tamanho();
        System.out.println(stack.size());
        //Mostra a pilha usando toString
        System.out.println(stack);
        //Aqui ele espia um elemento da pilha, equivalente ao nosso topo;
        System.out.println(stack.peek());
        //Desempilha um elemento do topo da pilha,
        // equivalente ao nosso desempilha();
        System.out.println(stack.pop());

        System.out.println(stack);


    }

}
