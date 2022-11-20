// Implemente a função ordena(lista), que recebe uma lista com números inteiros como parâmetro e 
// devolve esta lista ordenada em ordem crescente. Utilize o algoritmo selection sort.

package semana13;

import java.util.ArrayList;
import java.util.List;

import semana14.BubbleSort;
import semana14.InsertionSort;

public class OrdenaLista {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(GeradorListaGrande.listaGrande(60000));

        long startTime = System.currentTimeMillis();
        List<Integer> ordenadaComStream = ordenaComStream(list);
        long stopTime = System.currentTimeMillis();
        System.out.println(VerificaOrdenacao.ordenada(ordenadaComStream));
        //ordenadaComStream.forEach(i -> System.out.print(i + " "));
        System.out.println((stopTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        List<Integer> ordenadaComSS = ordenaComSS(list);
        stopTime = System.currentTimeMillis();
        System.out.println(VerificaOrdenacao.ordenada(ordenadaComSS));
        //ordenadaComSS.forEach(i -> System.out.print(i + " "));
        System.out.println((stopTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        List<Integer> ordenadaComBS = BubbleSort.bubbleSort(list);
        stopTime = System.currentTimeMillis();
        System.out.println(VerificaOrdenacao.ordenada(ordenadaComBS));
        //ordenadaComSS.forEach(i -> System.out.print(i + " "));
        System.out.println((stopTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        List<Integer> ordenadaComIS = InsertionSort.insertionSort(list);
        stopTime = System.currentTimeMillis();
        System.out.println(VerificaOrdenacao.ordenada(ordenadaComIS));
        //ordenadaComSS.forEach(i -> System.out.print(i + " "));
        System.out.println((stopTime - startTime) + "ms");
    }

    static List<Integer> ordenaComStream(List<Integer> list) {
        return list.stream().sorted().toList();
    }

    static List<Integer> ordenaComSS(List<Integer> list) {
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < size; j++)
                if (list.get(j) < list.get(indiceMenor))
                    indiceMenor = j;

            int ordenadaI = list.get(i);
            int ordenadaIM = list.get(indiceMenor);
            list.set(i, ordenadaIM);
            list.set(indiceMenor, ordenadaI);
        }

        return list;
    }
}
