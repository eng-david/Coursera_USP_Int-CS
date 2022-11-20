// Implemente a função bubble_sort(lista), que recebe uma lista com números inteiros como parâmetro e devolve esta 
// lista ordenada. Utilize o algoritmo bubble sort.
// Além de devolver uma lista ordenada, ao longo do processamento sua função deve imprimir o estado atual da lista 
// toda vez que fizer uma alteração em seus elementos.

package semana14;

import java.util.ArrayList;
import java.util.List;

import semana13.GeradorListaGrande;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> listaDesordenada = GeradorListaGrande.listaGrande(5);
        bubbleSort(new ArrayList<>(listaDesordenada));

        
    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        var swapsQty = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < (list.size() - 1); j++) {
                if (list.get(j) > list.get(j + 1)) {
                    var smaller = list.get(j + 1);
                    var bigger = list.get(j);
                    list.set(j, smaller);
                    list.set(j + 1, bigger);
                    list.forEach(e -> System.out.print(e + " "));
                    //System.out.println(" ");
                    swapsQty++;
                }
            }
            if (swapsQty == 0) break;
        }

        return list;
    }
}
