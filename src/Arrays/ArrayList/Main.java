package Arrays.ArrayList;

import java.util.ArrayList;

/**
 * Created by sg-0036936 on 22/09/2016.
 */

/* OVERVIEW:

  Utilização de tudo que está neste pacote
  de forma simples e objetiva utilizando
  uma API nativa do java.

  */
public class Main {

    public static void main(String[] args) {

        //ArrayList faz tudo que as outras classes do pacote ensinaram a fazer automaticamente.
        ArrayList<Contato> arrayList = new ArrayList<Contato>();

        //Criando array com vários tipos de dados e passando para o construtor
        Contato c1  = new Contato("Contato1", "1234-5678", "contato1@email.com");
        Contato c2  = new Contato("Contato2", "1289-5678", "contato2@email.com");
        Contato c3  = new Contato("Contato3", "0984-5678", "contato3@email.com");
        Contato c4  = new Contato("Contato4", "0984-5678", "contato4@email.com");
        Contato c5  = new Contato("Contato5", "0984-5678", "contato5@email.com");


        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);

        System.out.println(arrayList);

        //Adicionando elemento c4 na posição 0.
        arrayList.add(0, c4);

        System.out.println(arrayList);

        //Contains verifica se um elemento existe num array. Nesse caso c5 não foi adicionado.
        boolean existe = arrayList.contains(c5);
        //Como existe é boolean não precisa fazer == true, por padrão já é assim.
        if (existe) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }

        //Retorna c3 na posição 3 pois adicionamos c4 na posição 0 e passou td mundo pra frente.
        int posicao = arrayList.indexOf(c3);
        System.out.println(posicao);
        /*Caso não tenha na lista retorna -1, poderíamos criar
        um tratamento pra essa parte com um if (posicao > -1) etc etc */

        //Retorna o elemento na posição i.
        System.out.println(arrayList.get(2));

        //Aqui removemos c4 e então o array volta a ter c1 na posição 0.
        arrayList.remove(c4);
        System.out.println(arrayList.get(2));

        //Em vez de add um elemento e mover o array pra frente, esse método troca um elemento por outro. set(index, elemento)
        arrayList.set(0, c4);
        System.out.println(arrayList);

        //Tamanho do array, como o c1 foi substituído pelo c4. Temos um array com c4, c2 e c3.
        System.out.println(arrayList.size());

    }


}

