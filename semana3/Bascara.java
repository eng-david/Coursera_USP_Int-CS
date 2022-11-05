// escreva um programa que calcula as raízes de uma equação do segundo grau.

package semana3;

import java.util.Scanner;

public class Bascara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("a: ");
        Double a = Double.parseDouble(scan.nextLine());
        System.out.print("b: ");
        Double b = Double.parseDouble(scan.nextLine());
        System.out.print("c: ");
        Double c = Double.parseDouble(scan.nextLine());

        Double delta = Math.pow(b, 2) - 4 * a * c;
        //System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("esta equação não possui raízes reais");
        } else {
            Double raiz1 = ((-b + Math.sqrt(delta)) / (2 * a));
            if (delta == 0) {
                System.out.println("a raiz desta equação é " + raiz1);
            } else {
                Double raiz2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("as raízes da equação são " + Math.min(raiz1, raiz2) + " e " + Math.max(raiz1, raiz2));
            }
        }

        scan.close();
    }
}
