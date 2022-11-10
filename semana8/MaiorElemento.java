// Escreva a função maior_elemento que recebe como parâmetro uma lista com números inteiros e devolve um número inteiro correspondente 
// ao maior valor presente na lista recebida.

package semana8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaiorElemento {
    public static void main(String[] args) {
        List<Integer> lista = Stream.of(100, 1, 1, 2, 3, 4, 4, 4, 0, 1, 6, 7, 8, 5, 5, 5, 90).collect(Collectors.toList());
        System.out.println(maiorElemento(lista));
    }

    static Integer maiorElemento(List<Integer> lista){
        return lista.stream().max(Integer::compareTo).get();
    }
}
