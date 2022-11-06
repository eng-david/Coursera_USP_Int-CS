// Escreva a função fizzbuzz que recebe como parâmetro um número inteiro e devolve
// 'Fizz' se o número for divisível por 3 e não for divisível por 5;
// 'Buzz' se o número for divisível por 5 e não for divisível por 3;
// 'FizzBuzz' se o número for divisível por 3 e por 5;
// Caso o número não seja divisível 3 e também não seja divisível por 5, ela deve devolver o número recebido como parâmetro.

package semana5;

import java.util.Scanner;

public class VerificaFizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer i = Integer.parseInt(scan.nextLine());
        System.out.println(fizzBuzz(i));

        scan.close();
    }

    static String fizzBuzz(Integer n) {
        Boolean n3 = n % 3 == 0;
        Boolean n5 = n % 5 == 0;

        if (n3 & !n5)
            return "Fizz";
        if (!n3 & n5)
            return "Buzz";
        if (n3 & n5)
            return "FizzBuzz";
        return n.toString();
    }
}
