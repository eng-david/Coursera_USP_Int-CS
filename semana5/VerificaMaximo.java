// Escreva a função maximo que recebe 2 números inteiros como parâmetro e devolve o maior deles.


package semana5;

import java.util.Scanner;

public class VerificaMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n1 = Integer.parseInt(scanner.nextLine());
        Integer n2 = Integer.parseInt(scanner.nextLine());
        System.out.println(maximo(n1, n2));

        scanner.close();
    }

    static Integer maximo(Integer n1, Integer n2) {
        if (n1 > n2) return n1;
        else return n2;
    }
}
