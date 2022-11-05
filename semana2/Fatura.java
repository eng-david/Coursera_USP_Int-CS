// Escreva um programa que receba (entrada de dados através do teclado) o nome do cliente, o dia de vencimento, o mês de vencimento e o 
// valor da fatura  e imprima (saída de dados) a mensagem com os dados recebidos

package semana2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Fatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        System.out.print("Digite o dia do vencimento: ");
        Integer diaVencimento = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o mês de vencimento: ");
        String mesVencimento = scan.nextLine();
        System.out.print("Digite o valor da fatura: ");
        BigDecimal valor = new BigDecimal(scan.nextLine());

        System.out.println("Olá " + nome);
        System.out.println("A sua fatura com vencimento em " + diaVencimento + " de " + mesVencimento + " no valor de R$ " + valor + " está fechada.");
    
        scan.close();

    }
}
