package semana2;
// Faça um programa em Python que receba quatro notas, calcule e imprima a média aritmética.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        notas.add(Double.parseDouble(scan.nextLine()));
        System.out.print("Digite a segunda nota: ");
        notas.add(Double.parseDouble(scan.nextLine()));
        System.out.print("Digite a terceira nota: ");
        notas.add(Double.parseDouble(scan.nextLine()));
        System.out.print("Digite a quarta nota: ");
        notas.add(Double.parseDouble(scan.nextLine()));

        Double media = 0.0;
        for (Double n : notas) {
            media += n;
        }
        media /= notas.size();

        System.out.println("A média aritmética é: " + media);

        scan.close();

    }
}
