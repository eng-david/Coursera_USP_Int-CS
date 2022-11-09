// Refaça o exercício 1 imprimindo os retângulos sem preenchimento, de forma que os caracteres que não estiverem na borda do 
// retângulo sejam espaços.

package semana7;

import java.util.Scanner;

public class RetanguloVazio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite a largura: ");
        Integer l = Integer.parseInt(scan.nextLine());
        System.out.print("digite a altura: ");
        Integer h = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 | i == (h - 1))
                    System.out.print("#");
                else if (j == 0 | j == (l - 1))
                    System.out.print("#");
                    else System.out.print(" ");

            }
            System.out.println("");
        }

        scan.close();
    }
}
