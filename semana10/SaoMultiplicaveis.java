// Duas matrizes são multiplicáveis se o número de colunas da primeira é igual ao número 
// de linhas da segunda. Escreva a função sao_multiplicáveis(m1, m2) que recebe duas matrizes 
// como parâmetro e devolve True se as matrizes forem multiplicáveis (na ordem dada) e False 
// caso contrário.

package semana10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SaoMultiplicaveis {
    public static void main(String[] args) {

        // com matrizes
        Integer[][] matriz1 = { { 1 }, { 4 } };
        Integer[][] matriz2 = { { 1, 2, 3 } };

        if (matrizSaoMultiplicaveis(matriz1, matriz2))
            System.out.println("true");
        else
            System.out.println("false");

        // com lists
        List<List<Integer>> matrizList1 = Arrays.stream(matriz1).map(Arrays::asList).collect(Collectors.toList());
        List<List<Integer>> matrizList2 = Arrays.stream(matriz2).map(Arrays::asList).collect(Collectors.toList());

        if (listaSaoMultiplicaveis(matrizList1, matrizList2))
            System.out.println("true");
        else
            System.out.println("false");

    }

    static Boolean matrizSaoMultiplicaveis(Integer[][] matriz1, Integer[][] matriz2) {

        if (matriz1[0].length == matriz2.length & matriz1.length == matriz2[0].length)
            return true;

        return false;

    }

    static Boolean listaSaoMultiplicaveis(List<List<Integer>> matrizList1, List<List<Integer>> matrizList2) {

        if (matrizList1.get(0).size() == matrizList2.size() & matrizList1.size() == matrizList2.get(0).size())
            return true;

        return false;
    }

}