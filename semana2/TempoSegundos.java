package semana2;
// dado um determinado número de segundos informado pelo usuário, imprime o tempo correspondente em dias, horas, minutos e segundos.

import java.util.Scanner;

public class TempoSegundos {
    public static void main(String[] args) {
        System.out.println("Digite o numero de segundos que deseja converter: ");
        Scanner scan = new Scanner(System.in);
        Integer s = Integer.parseInt(scan.nextLine());
        Integer dias = s/86400;
        s %= 86400;
        Integer horas = s/3600;
        s %= 3600;
        Integer minutos = s/60;
        s %= 60;

        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + s);

        scan.close();
    }
}
