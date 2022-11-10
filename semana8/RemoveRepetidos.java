// Escreva a função remove_repetidos que recebe como parâmetro uma lista com números inteiros, verifica se tal lista possui elementos 
// repetidos e os remove. A função deve devolver uma lista correspondente à primeira lista, sem elementos repetidos. 
// A lista devolvida deve estar ordenada.

package semana8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveRepetidos {
    public static void main(String[] args) {
        List<Integer> lista = Stream.of(1, 1, 1, 2, 3, 4, 4, 4, 0, 1, 6, 7, 8, 5, 5, 5).collect(Collectors.toList());
        System.out.println(removeRepetidos(lista));
    }

    static List<Integer> removeRepetidos(List<Integer> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {
            Integer item = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                Integer comp = lista.get(j);
                if (item == comp) {
                    lista.remove(j);
                    j -= 1;
                }
            }
        }

        lista.sort(Integer::compareTo);
        return lista;

    }
}
