package semana7;

import java.util.Scanner;

public class DecomposicaoFatoresPrimos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("numero: ");
        Integer n = Integer.parseInt(scan.nextLine());
        
        Integer fator = 2;
        Integer divisao = 0;

        while (n > 1){
            if (n % fator == 0) {
                divisao = n / fator;
                System.out.println(n + " / " + fator + " = " + divisao);
                n = divisao;
            }

            fator += 1;
        }

        scan.close();
    }
}