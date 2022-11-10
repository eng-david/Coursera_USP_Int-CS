// Escreva a função soma_elementos que recebe como parâmetro uma lista com números inteiros e devolve um número inteiro
// correspondente à soma dos elementos da lista recebida.

package semana8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomaElementos {
    public static void main(String[] args) {
        List<Integer> lista = Stream.of(1, 1, 1, 2, 3, 4, 4, 4, 0, 1, 6, 7, 8, 5, 5, 5).collect(Collectors.toList());
        System.out.println(somaElementos(lista));
    }

    static Integer somaElementos(List<Integer> lista) {
        Integer sum = 0;
        for (Integer item : lista) {
            sum += item;
        }
        return sum;
    }
}
