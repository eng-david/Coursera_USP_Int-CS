// Implemente a função fibonacci(n), que recebe como parâmetro um número inteiro e devolve um número 
// inteiro correspondente ao n-ésimo elemento da sequência de Fibonacci. Sua solução deve ser implementada 
// utilizando recursão.

package semana15;

public class FibonacciComRecursao {
    public static void main(String[] args) {
        System.out.println(fibonacciComRecursao(5));
    }

    public static Integer fibonacciComRecursao(Integer n){
        if (n <= 1) return n;

        return fibonacciComRecursao(n - 1) + fibonacciComRecursao(n - 2);
    }
}
