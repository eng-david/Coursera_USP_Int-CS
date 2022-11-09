// Escreva um programa que receba um número inteiro positivo na entrada e verifique se é primo. Se o número for primo, imprima "primo". Caso contrário, imprima "não primo".

package semana4;

import java.util.Scanner;

public class TestaNumeroPrimo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        Integer i = Integer.parseInt(scan.nextLine());

        if (testaPrimo(i))
            System.out.println("primo");
        else
            System.out.println("não é primo");

        scan.close();
    }

    public static Boolean testaPrimo(Integer i) {

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
