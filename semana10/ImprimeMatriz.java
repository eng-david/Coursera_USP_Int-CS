// Como proposto na primeira vídeo-aula da semana, escreva uma função imprime_matriz(matriz), 
// que recebe uma matriz como parâmetro e imprime a matriz, linha por linha. Note que NÃO se 
// deve imprimir espaços após o último elemento de cada linha!

package semana10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImprimeMatriz {
    public static void main(String[] args) {

        // com matrizes
        Integer[][] matriz1 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
        imprimeMatriz(matriz1);

        // com lists
        List<List<Integer>> matrizList1 = Arrays.stream(matriz1).map(Arrays::asList).collect(Collectors.toList());
        imprimeList(matrizList1);

    }

    static void imprimeMatriz(Integer[][] matriz1) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                sb.append(matriz1[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    static void imprimeList(List<List<Integer>> matrizList1) {
        StringBuilder sb = new StringBuilder();
        matrizList1.forEach(l -> {
            l.forEach(i -> {
                sb.append(i + " ");
            });
            sb.append("\n");
        });
        System.out.println(sb);
    }

}