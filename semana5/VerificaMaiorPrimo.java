// Escreva a função maior_primo que recebe um número inteiro maior ou igual a 2 como parâmetro e devolve o maior número primo menor ou igual ao número passado à função

package semana5;

import java.util.Scanner;
import semana4.TestaNumeroPrimo;

public class VerificaMaiorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        System.out.println(maiorPrimo(n));

        scanner.close();
    }

    static Integer maiorPrimo(Integer n) {
        if (n >= 2) {
            while (!TestaNumeroPrimo.testaPrimo(n)) {
                n -= 1;
            }
            return n;
        }
        return null;
    }
}
