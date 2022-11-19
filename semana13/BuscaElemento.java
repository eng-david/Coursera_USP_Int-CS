// Implemente a função busca(lista, elemento), que busca um determinado elemento em uma lista e 
// devolve o índice correspondente à posição do elemento encontrado. Utilize o algoritmo de 
// busca sequencial. Nos casos em que o elemento buscado não existir na lista, a função deve 
// devolver o booleano False.

package semana13;

import java.util.Arrays;
import java.util.List;

public class BuscaElemento {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abacaxi", "maça", "banana", "laranja", "uva");
        System.out.println(busca(list, "abacaxi"));
    }

    static Integer busca(List<?> list, String item) {
        if (list.contains(item))
            return list.indexOf(item);

        return -1;
    }
}
