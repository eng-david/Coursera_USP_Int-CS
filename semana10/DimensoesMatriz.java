// Escreva uma função dimensoes(matriz) que recebe uma matriz como parâmetro e imprime 
// as dimensões da matriz recebida, no formato iXj.

package semana10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DimensoesMatriz {
    public static void main(String[] args) {
        
        Integer[][] matriz = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
        dimensoesMatriz(matriz);
        
        
        List<List<Integer>> matrizList = Arrays.stream(matriz).map(Arrays::asList).collect(Collectors.toList());
        dimensoesList(matrizList);
    }

    static void dimensoesMatriz(Integer[][] matriz) {
        System.out.println(matriz.length + "X" + matriz[0].length);
    }

    static void dimensoesList(List<List<Integer>> matrizList) {
        System.out.println(matrizList.size() + "X" + matrizList.get(0).size());
    }
}