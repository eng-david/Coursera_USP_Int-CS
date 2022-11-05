// Receba um número inteiro positivo na entrada e imprima os  n primeiros números ímpares naturais.

package semana4;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Integer i = Integer.parseInt(scan.nextLine());
        
        Integer num = 1;
        while (i > 0) {
            System.out.println(num);
            num += 2;
            i -= 1;
        }
        scan.close();
    }
}
