package Arrays.ConfigTipoDeArrayDinamicamente;

/**
 * Created by sg-0036936 on 22/09/2016.
 */

/* OVERVIEW:

  Aqui restringiremos o tipo de dado
  que pode ser adicionado como
  elemento de um vetor. Pois não
  é uma boa prática deixar livre
  usando a Object.

  */
public class Main {

    public static void main(String[] args) {

        //Aqui eu adicionei com <> um tipo onde só será aceito elementos daquele tipo.
        Vetor<Contato> vetor = new Vetor(5);

        //Criando array com vários tipos de dados e passando para o construtor
        Contato c1  = new Contato("Contato1", "1234-5678", "contato1@email.com");
        Contato c2  = new Contato("Contato2", "1289-5678", "contato2@email.com");
        Contato c3  = new Contato("Contato3", "0984-5678", "contato3@email.com");
        Contato c4  = new Contato("Contato3", "0984-5678", "contato3@email.com");


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

    }


}

