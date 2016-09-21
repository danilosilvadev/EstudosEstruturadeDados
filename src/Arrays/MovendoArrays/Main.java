package Arrays.MovendoArrays;

/* OVERVIEW:

  Esse código é um código que adiciona
 elementos a um array em qualquer posição
 sem excluir os outros elementos,
 movendo-se assim pra frente os outros.

  */
public class Main {

    public static  void  main(String[] args){

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);

        vetor.adiciona(3, "D");

        System.out.println(vetor);




    }


}
