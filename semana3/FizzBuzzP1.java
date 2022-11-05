package semana3;

import java.util.Scanner;

// Receba um número inteiro na entrada e imprima Fizz se o número for divisível por 3. Caso contrário, imprima o mesmo número que foi dado na entrada.

public class FizzBuzzP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer i = Integer.parseInt(scanner.nextLine());
        if (i % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }

        scanner.close();
    }
}
