// Escreva uma função soma_hipotenusas que receba como parâmetro um número inteiro positivo  n n e devolva a soma de
// todos os inteiros entre 1 e  n n que são comprimento da hipotenusa de algum triângulo retângulo com catetos inteiros.

// Para n = 25, as hipotenusas são:
// 5, 10, 13, 15, 17, 20, 25
// note que cada número deve ser somado apenas uma vez. Assim:
// soma_hipotenusas(25)
// deve devolver 105

// >>>soma_hipotenusas(25)
// i^2 + j^2 = hipotenusa_teste^2
// 3^2 + 4^2 = 5^2
// 6^2 + 8^2 = 10^2
// 5^2 + 12^2 = 13^2
// 9^2 + 12^2 = 15^2
// 8^2 + 15^2 = 17^2
// 12^2 + 16^2 = 20^2
// 7^2 + 24^2 = 25^2
// 105

package semana7;

import java.util.Scanner;

public class VerificaHipotenusa {

    static Integer totalIteracoes = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("numero: ");
        Integer n = Integer.parseInt(scanner.nextLine());
        System.out.println(somaHipotenusas(n));
        System.out.println("total iteracoes: " + totalIteracoes);
        
        scanner.close();
        long stopTime = System.currentTimeMillis();
        System.out.println((stopTime - startTime) + "ms");
    }

    static Integer somaHipotenusas(Integer n) {
        Integer sum = 0;
        for (int i = 5; i <= n; i++) {
            if (ehHipotenusa(i))
                sum += i;
        }
        return sum;
    }

    static Boolean ehHipotenusa(Integer hipotenusaTeste) {

        Double hipotenusaTesteSquared = Math.pow(hipotenusaTeste, 2);
        Double hipotenusa = 0.0;
        Integer iteracoes = 0;

        for (Integer i = 1; i < hipotenusaTeste; i++) {
            for (Integer j = 1; j < hipotenusaTeste; j++) {
                iteracoes += 1;
                hipotenusa = Math.pow(i, 2) + Math.pow(j, 2); // não usa sqrt para economizar recursos
                if (hipotenusa > hipotenusaTesteSquared) break;
                if (hipotenusa.compareTo(hipotenusaTesteSquared) == 0) {
                    totalIteracoes += iteracoes;
                    System.out.println(hipotenusaTeste + " iteracoes: " + iteracoes);
                    return true;
                }
            }
        }
        totalIteracoes += iteracoes;
        System.out.println(hipotenusaTeste + " iteracoes: " + iteracoes);
        return false;
    }
}