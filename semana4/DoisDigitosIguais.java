// Escreva um programa que receba um número inteiro na entrada e verifique se o número recebido possui ao menos um dígito com um dígito adjacente igual a ele. Caso exista, imprima "sim"; se não existir, imprima "não".

package semana4;

import java.util.Scanner;

public class DoisDigitosIguais {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        Long i = Long.parseLong(scan.nextLine());
        
        Boolean doisIguais = false;

        Long n1, n2;
        while (true) {
            n1 = i % 10;
            i /= 10;
            if (! (i > 0))
                break;
            n2 = i % 10;

            if (n1 == n2)
                doisIguais = true;
        }

        if (doisIguais)
            System.out.println("sim");
        else
            System.out.println("não");

        scan.close();
    }
}
