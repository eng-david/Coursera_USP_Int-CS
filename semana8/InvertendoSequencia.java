// Como pedido na primeira video-aula desta semana, escreva um programa que recebe uma sequência de números inteiros e imprima todos os 
// valores em ordem inversa. A sequência sempre termina pelo número 0. Note que 0 (ZERO) não deve fazer parte da sequência.


package semana8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InvertendoSequencia {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número: ");
            Integer i = Integer.parseInt(scan.nextLine());
            if (i == 0) {
                System.out.println();
                break;
            }
            lista.add(i);
        }
        
        Collections.reverse(lista);
        lista.forEach(System.out::println);

        scan.close();
    }
}
