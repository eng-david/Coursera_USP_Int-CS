// Escreva a função lista_grande(n), que recebe como parâmetro um número inteiro n e devolve 
// uma lista contendo n números inteiros aleatórios.

package semana13;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class GeradorListaGrande {
    public static void main(String[] args) {
        List<Integer> list = listaGrande(600);
        list.forEach(i -> System.out.print(i + " "));
    }

    static List<Integer> listaGrande (Integer s) {
        return IntStream.range(0, s).mapToObj(i -> new Random().nextInt(1000)).toList();
    }
}
