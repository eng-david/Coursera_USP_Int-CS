// Como pedido no segundo vídeo da semana, escreva a função primeiro_lex(lista) que recebe 
// uma lista de strings como parâmetro e devolve o primeiro string na ordem lexicográfica. 
// Neste exercício, considere letras maiúsculas e minúsculas.

package semana11;

import java.util.Arrays;
import java.util.List;

public class PrimeiroLex {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "bob", "charles", "Ana", "BOB");
        System.out.println(verificaPrimeiroLex(nomes));
    }

    static String verificaPrimeiroLex(List<String> nomes) {

        return nomes.stream().map(String::trim).sorted().toList().get(0);
    }
}