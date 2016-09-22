package Arrays.Exercícios;

/**
 * Created by sg-0036936 on 22/09/2016.
 */

/* OVERVIEW:

  Melhore a classe Lista e implemente o
  método limpar, onde todos os elementos
  da lista são removidos. Esse método é
  semelhante ao método clear da classe
  ArrayList.

  */
public class E05 {

    public static void main(String[] args) {

        //Aqui eu adicionei com <> um tipo onde só será aceito elementos daquele tipo.
        Vetor<Contato> vetor = new Vetor(5);

        //Criando array com vários tipos de dados e passando para o construtor
        Contato c1  = new Contato("Contato1", "1234-5678", "contato1@email.com");
        Contato c2  = new Contato("Contato2", "1289-5678", "contato2@email.com");
        Contato c3  = new Contato("Contato3", "0984-5678", "contato3@email.com");
        Contato c4  = new Contato("Contato4", "0984-5678", "contato4@email.com");


        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);

        /*realiza uma busca pra ver se esse contato já
        existe no vetor. Em contato o equals() fez a
        comparação de c4 com os elementos do array
        e como era idêntico a c3 passou true pro if. */
        int pos = vetor.busca(c4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        //Aqui eu verifico se contém o elemento
        int contem = vetor.contem(c2);
        if (contem > -1) {
            System.out.println("Contém o elemento.");
        } else {
            System.out.println("Não contém o elemento.");
        }

        vetor.ultimoIndice();

        //Aqui eu removo o elemento.
        boolean remover = vetor.remover(c1);
        System.out.println(vetor);

        //Aqui eu obtenho o elemento através do index
        vetor.obter(1);

        //Demonstração que o vetor não está vazio
        System.out.println(vetor);

        //Aqui eu limpo td o vetor
        vetor.limpar();

        //Aqui eu mostro um vetor vazio []
        System.out.println(vetor);



    }


}
