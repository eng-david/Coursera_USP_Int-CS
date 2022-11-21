// Implemente a função soma_lista(lista), que recebe como parâmetro uma lista de números inteiros e devolve um número 
// inteiro correspondente à soma dos elementos desta lista.
// Sua solução deve ser implementada utilizando recursão.

package semana15;

import java.util.ArrayList;
import java.util.List;

import semana13.GeradorListaGrande;

public class SomaComRecursao {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(GeradorListaGrande.listaGrande(4));
        list.forEach(i -> System.out.print(i + " "));
        System.out.println(" ");
        
        Integer soma = somaComRecursao(list);
        System.out.println(soma);
    }

    public static Integer somaComRecursao(List<Integer> list){
        if (list.size() == 0) return 0;

        return list.get(0) + somaComRecursao(list.subList(1, list.size()) );
    }
}
