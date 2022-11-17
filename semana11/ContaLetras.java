// Escreva a função conta_letras(frase, contar="vogais"), que recebe como primeiro parâmetro 
// uma string contendo uma frase e como segundo parâmetro uma outra string. Este segundo 
// parâmetro deve ser opcional.
// Quando o segundo parâmetro for definido como "vogais", a função deve devolver o numero 
// de vogais presentes na frase. Quando ele for definido como "consoantes", a função deve 
// devolver o número de consoantes presentes na frase. Se este parâmetro não for passado 
// para a função, deve-se assumir o valor "vogais" para o parâmetro.

package semana11;

public class ContaLetras {
    public static void main(String[] args) {
        String frase = "Testando Detector De Letras Por Tipo";
        // consoantes = 19
        // vogais = 12
        System.out.println(contaLetras(frase, "vogais"));
    }

    static Long contaLetras(String frase, String tipo) {
        frase = frase.toLowerCase();
        Long vowelQty = frase.chars().filter(c -> c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u').boxed().count();

        if (tipo == "vogais")
            return vowelQty;

        if (tipo == "consoantes")
            return (frase.chars().filter(c -> c != ' ').boxed().count() - vowelQty);

        return null;

    }

    // sobrecarga
    static Long contaLetras(String frase) {
        return contaLetras(frase, "vogais");
    }
}