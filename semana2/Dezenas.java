package semana2;
// Imprime o digito das dezenas de um numero inteiro informado pelo usuário

import java.util.Scanner;

public class Dezenas {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro: ");
        Scanner  scan = new Scanner(System.in);
        Integer i = Integer.parseInt(scan.nextLine());
        i = (i / 10) % 10;
        
        System.out.println("O digito das dezenas é " + i);

        scan.close();
    }
}
