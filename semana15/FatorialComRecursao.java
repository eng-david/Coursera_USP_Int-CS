// Implemente a função fatorial(x), que recebe como parâmetro um número inteiro e devolve um número inteiro 
// correspondente ao fatorial de x.
// Sua solução deve ser implementada utilizando recursão.

package semana15;

public class FatorialComRecursao {
    public static void main(String[] args) {
        System.out.println(fatorialComRecursao(0));
    }

    public static Integer fatorialComRecursao(Integer n) {
        if (n < 2) return 1;

        return n * fatorialComRecursao(n - 1);
    }
}
