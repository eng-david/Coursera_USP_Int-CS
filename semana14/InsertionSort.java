// Implemente a função insertion_sort(lista), que recebe uma lista com números inteiros como parâmetro e devolve 
// esta lista ordenada. Utilize o algoritmo insertion sort.

package semana14;

import java.util.ArrayList;
import java.util.List;

import semana13.GeradorListaGrande;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> listaDesordenada = GeradorListaGrande.listaGrande(5);
        
        insertionSort(new ArrayList<>(listaDesordenada));
    }

    public static List<Integer> insertionSort(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            //list.forEach(e -> System.out.print(e + " "));
            var chave = list.get(i + 1);
            var indice = i;

            while (indice >= 0 && chave < list.get(indice)) {
                list.set(indice + 1, list.get(indice));
                indice--;
            }
            list.set(indice + 1, chave);
            //System.out.print(" -> ");
            //list.forEach(e -> System.out.print(e + " "));
            //System.out.println(" ");
        }

        return list;
    }
}
