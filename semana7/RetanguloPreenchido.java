// Escreva um programa que recebe como entradas (utilize a função input) dois números inteiros correspondentes à largura e à altura de um 
// retângulo, respectivamente. O programa deve imprimir, usando repetições encaixadas (laços aninhados), uma cadeia de caracteres que 
// represente o retângulo informado com caracteres '#' na saída.

package semana7;

import java.util.Scanner;

public class RetanguloPreenchido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite a largura: ");
        Integer l = Integer.parseInt(scan.nextLine());
        System.out.print("digite a altura: ");
        Integer h = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        scan.close();
    }
}
