// Escreva a função ordenada(lista), que recebe uma lista com números inteiros como parâmetro e 
// devolve o booleano True se a lista estiver ordenada e False se a lista não estiver ordenada.

package semana13;

import java.util.List;

public class VerificaOrdenacao {
    public static void main(String[] args) {
        
        List<Integer> lista = GeradorListaGrande.listaGrande(600000);

        long startTime = System.currentTimeMillis();
        System.out.println(ordenada(lista));
        long stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(ordenadaStream(lista));
        stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTime) + "ms");
    }

    static Boolean ordenada(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1))
                return false;
        }
        return true;
    }

    static Boolean ordenadaStream(List<Integer> list) {
        return list.stream().sorted().toList().equals(list);
    }
}
