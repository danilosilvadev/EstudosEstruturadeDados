package Arrays.AumentarACapacidade;


/* OVERVIEW:

  Esse código aumenta a capacidade
  de um array. Para visualizar o funcionamento
  é necessário executar em modo debug.

  */
public class Main {

    public static  void  main(String[] args){

        Vetor vetor = new Vetor(5);

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
