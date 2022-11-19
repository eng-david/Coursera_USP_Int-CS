// Implemente a função ordena(lista), que recebe uma lista com números inteiros como parâmetro e 
// devolve esta lista ordenada em ordem crescente. Utilize o algoritmo selection sort.

package semana13;

import java.util.ArrayList;
import java.util.List;

public class OrdenaLista {
    public static void main(String[] args) {
        List<Integer> list = GeradorListaGrande.listaGrande(6000);

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
    }

    static List<Integer> ordenaComStream(List<Integer> list) {
        return list.stream().sorted().toList();
    }

    static List<Integer> ordenaComSS(List<Integer> list) {
        List<Integer> ordenada = new ArrayList<>(list);
        int size = ordenada.size();

        for (int i = 0; i < size - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < size; j++)
                if (ordenada.get(j) < ordenada.get(indiceMenor))
                    indiceMenor = j;

            int ordenadaI = ordenada.get(i);
            int ordenadaIM = ordenada.get(indiceMenor);
            ordenada.set(i, ordenadaIM);
            ordenada.set(indiceMenor, ordenadaI);
        }

        return ordenada;
    }
}
