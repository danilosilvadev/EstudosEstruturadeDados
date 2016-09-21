package Arrays.RemoverElementoDeUmArray;


/* OVERVIEW:

  Aqui retiro um elemento de um array
  em qualquer posição e movo o resto
  do array para ficar na posição devida

  */
public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.remove(0);
        vetor.remove(1);

        System.out.println(vetor);

        //2º meio - removendo pelo elemento em vez da posição
        System.out.println("Remover o B");

        int pos = vetor.busca("B");
        if (pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("O elemento não existe no vetor");
        }

        System.out.println(vetor);

    }


}
