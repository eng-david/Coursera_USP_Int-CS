// Escreva a função soma_matrizes(m1, m2) que recebe 2 matrizes e devolve uma matriz que 
// represente sua soma caso as matrizes tenham dimensões iguais. Caso contrário, a função 
// deve devolver False.

package semana10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SomaMatrizes {
    public static void main(String[] args) {

        // com matrizes
        Integer[][] matriz1 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
        Integer[][] matriz2 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
        Integer[][] soma = somaMatriz(matriz1, matriz2);
        System.out.println(Arrays.stream(soma).map(Arrays::asList).collect(Collectors.toList()));

        // com lists
        List<List<Integer>> matrizList1 = Arrays.stream(matriz1).map(Arrays::asList).collect(Collectors.toList());
        List<List<Integer>> matrizList2 = Arrays.stream(matriz2).map(Arrays::asList).collect(Collectors.toList());
        System.out.println(somaList(matrizList1, matrizList2));

    }

    static Integer[][] somaMatriz(Integer[][] matriz1, Integer[][] matriz2) {

        int matriz1Rows = matriz1.length;
        int matriz1Columns = matriz1[0].length;
        int matriz2Rows = matriz2.length;
        int matriz2Columns = matriz2[0].length;

        if (matriz1Rows == matriz2Rows & matriz1Columns == matriz2Columns) {
            Integer[][] soma = new Integer[matriz1Rows][matriz1Columns];
            for (int i = 0; i < matriz1Rows; i++) {
                for (int j = 0; j < matriz1Columns; j++) {
                    soma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            return soma;
        }
        return null;
    }

    static List<List<Integer>> somaList(List<List<Integer>> matrizList1, List<List<Integer>> matrizList2) {

        if (matrizList1.size() == matrizList2.size() & matrizList1.get(0).size() == matrizList2.get(0).size()) {
            return IntStream.range(0, matrizList1.size())
                    .mapToObj(i -> IntStream.range(0, matrizList1.get(0).size())
                            .mapToObj(j -> matrizList1.get(i).get(j) + matrizList2.get(i).get(j))
                            .collect(Collectors.toList()))
                    .collect(Collectors.toList());
        }
        
        return null;
    }
    
}