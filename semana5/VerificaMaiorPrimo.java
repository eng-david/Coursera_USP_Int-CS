// Escreva a função maior_primo que recebe um número inteiro maior ou igual a 2 como parâmetro e devolve o maior número primo menor ou igual ao número passado à função

package semana5;

import java.util.Scanner;

public class VerificaMaiorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        System.out.println(maiorPrimo(n));

        scanner.close();
    }

    static Integer maiorPrimo(Integer n) {
        if (n >= 2) {
            while (!testaPrimo(n)) {
                n -= 1;
            }
            return n;
        }
        return null;
    }

    static Boolean testaPrimo(Integer i) {

        if (i > 0) {
            if (i == 1)
                return false;

            Integer divisor = 2;
            while (divisor < i) {
                if (i % divisor == 0)
                    return false;
                divisor += 1;
            }
        }
        return true;
    }
}
