package semana5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Escreva a função vogal que recebe um único caractere como parâmetro e devolve True se ele for uma vogal e False se for uma consoante

public class TestaVogal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character letra = new StringBuilder(scan.nextLine()).charAt(0);
        System.out.println(vogal(letra));
        scan.close();
    }

    static Boolean vogal(Character letra) {
        final List<Character> vogais = Arrays.asList('A', 'E', 'I', 'O', 'U');

        if (vogais.contains(Character.toUpperCase(letra)))
            return true;
        else
            return false;
    }
}
