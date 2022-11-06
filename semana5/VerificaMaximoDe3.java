// Escreva a função maximo que recebe 2 números inteiros como parâmetro e devolve o maior deles.

package semana5;

import java.util.Arrays;
import java.util.Scanner;

public class VerificaMaximoDe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n1 = Integer.parseInt(scanner.nextLine());
        Integer n2 = Integer.parseInt(scanner.nextLine());
        Integer n3 = Integer.parseInt(scanner.nextLine());
        System.out.println(maximo(n1, n2, n3));

        scanner.close();
    }

    static Integer maximo(Integer... numeros) {
        // List<Integer> numerosList = Arrays.asList(numeros);
        // Integer maximo = numerosList.get(0);
        // for (Integer num : numeros) {
        // if (num > maximo) maximo = num;
        // }
        // return maximo;
        return Arrays.asList(numeros).stream().max(Integer::compare).get();

    }
}
