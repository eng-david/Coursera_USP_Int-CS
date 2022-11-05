// Receba 3 números inteiros na entrada e imprima crescente se eles forem dados em ordem crescente. Caso contrário, imprima não está em ordem crescente
// foi adaptado para receber quantidade indefinida.

package semana3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        Integer input = 0;

        while (true) {
            try {
                input = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                break;
            }
            numeros.add(input);
        }

        Boolean crescente = true;
        for(int i = 0; i < numeros.size() - 1; i++){
            if (numeros.get(i) > numeros.get(i + 1)) {
                crescente = false;
                break;
            }
        }

        if (crescente) System.out.println("crescente");
        else System.out.println("não está em ordem crescente");
     
        scan.close();
    }
}
