package semana2;
// Converte uma temperatura em Fahrenheit informada pelo usuário em Celsius;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        Double tempF = Double.parseDouble(scanner.nextLine());
        Double tempC = (tempF - 32) * 5 / 9;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("A temperatura em Celsius é: " + df.format(tempC) + "c");

        scanner.close();
    }
}
