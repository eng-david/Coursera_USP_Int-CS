package semana7;

import java.util.Scanner;

import semana4.TestaNumeroPrimo;

// Escreva a função n_primos que recebe como argumento um número inteiro maior ou igual a 2 como parâmetro e devolve a quantidade 
// de números primos que existem entre 2 e n (incluindo 2 e, se for o caso, n).

public class VerificaNPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("numero: ");
        Integer n = Integer.parseInt(scan.nextLine());

        Integer qty = nPrimos(n);
        System.out.println(qty);

        scan.close();
    }

    static Integer nPrimos(Integer n){
        Integer qty = 0;
        for (int i = 2; i <= n; i++) {
            if (TestaNumeroPrimo.testaPrimo(i)) qty+= 1;
        }
        return qty;
    }
}