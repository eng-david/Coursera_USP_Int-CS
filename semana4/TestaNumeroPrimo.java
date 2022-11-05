// Escreva um programa que receba um número inteiro positivo na entrada e verifique se é primo. Se o número for primo, imprima "primo". Caso contrário, imprima "não primo".

package semana4;

import java.util.Scanner;

public class TestaNumeroPrimo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        Integer i = Integer.parseInt(scan.nextLine());

        Boolean ehPrimo = true;

        if (i > 0) {
            if (i == 1)
                ehPrimo = false;

            Integer divisor = 2;
            while (ehPrimo & divisor < i) {
                if (i % divisor == 0)
                    ehPrimo = false;
                divisor += 1;
            }

        }

        if (ehPrimo)
            System.out.println("é primo");
        else
            System.out.println("não é primo");

        scan.close();
    }
}
