// Implemente a função busca(lista, elemento), que busca um determinado elemento em uma lista e devolve o índice 
// correspondente à posição do elemento encontrado. Utilize o algoritmo de busca binária. Nos casos em que o elemento 
// buscado não existir na lista, a função deve devolver o booleano False.
// Além de devolver o índice correspondente à posição do elemento encontrado, sua função deve imprimir cada um 
// dos índices testados pelo algoritmo.

package semana14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import semana13.GeradorListaGrande;

public class BuscaBinaria {

    public static Integer iterations = 0;

    public static void main(String[] args) {
        Integer listSize = 600_000;
        List<Integer> list = new ArrayList<>(GeradorListaGrande.listaGrande(listSize));
        list.sort(Integer::compareTo);

        Scanner scan = new Scanner(System.in);

        while (true) {
            iterations = 0;
            System.out.println(buscaBinaria(list, list.get(new Random().nextInt(listSize))));
            System.out.println("iterations : " + iterations);
            if (scan.nextLine() == "e")
                break;
        }

        scan.close();
    }

    public static Integer buscaBinaria(List<Integer> list, Integer element) {

        Integer first = 0;
        Integer last = list.size() - 1;

        while (first <= last) {
            iterations++;
            var middle = (first + last) / 2;
            // System.out.println(middle);
            Integer middleElement = list.get(middle);

            if (Integer.compare(middleElement, element) == 0)
                return middle;
            if (Integer.compare(middleElement, element) > 0)
                last = middle - 1;
            else
                first = middle + 1;
        }

        return -1;
    }
}
