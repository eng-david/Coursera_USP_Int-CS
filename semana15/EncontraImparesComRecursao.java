// Implemente a função encontra_impares(lista), que recebe como parâmetro uma lista de números inteiros e 
// devolve uma outra lista apenas com os números ímpares da lista dada.
// Sua solução deve ser implementada utilizando recursão.

package semana15;

import java.util.ArrayList;
import java.util.List;

import semana13.GeradorListaGrande;

public class EncontraImparesComRecursao {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(GeradorListaGrande.listaGrande(4));
        list.forEach(i -> System.out.print(i + " "));
        System.out.println(" ");
        
        List<Integer> impares = encontraImparesComRecursao(list);
        impares.forEach(i -> System.out.print(i + " "));
        System.out.println(" ");
    }

    public static List<Integer> encontraImparesComRecursao(List<Integer> list) {
        List<Integer> impares = new ArrayList<>();

        if (list.size() == 0) return impares;

        if (list.get(0) % 2 == 1)
            impares.addAll(list.subList(0, 1));

        impares.addAll(encontraImparesComRecursao(list.subList(1, list.size())));

        return impares;
    }
}
