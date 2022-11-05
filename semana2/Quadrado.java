package semana2;
// Faça um programa em Python que receba (entrada de dados) o valor correspondente ao lado de um quadrado, calcule e imprima (saída de dados) seu perímetro e sua área.

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor correspondente ao lado de um quadrado: ");
        Double l = Double.parseDouble(scan.nextLine());

        Double perímetro = l * 4;
        Double area = l * l;

        System.out.println("Perímetro: " + perímetro + " área: " + area);

        scan.close();

    }
}
