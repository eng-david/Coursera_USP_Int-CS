// Como pedido no primeiro vídeo desta semana, escreva uma função menor_nome(nomes) que recebe 
// uma lista de strings com nome de pessoas como parâmetro e devolve o nome mais curto presente 
// na lista.
// A função deve ignorar espaços antes e depois do nome e deve devolver o menor nome presente 
// na lista. Este nome deve ser devolvido com a primeira letra maiúscula e seus demais caracteres 
// minúsculos, independente de como tenha sido apresentado na lista passada para a função.
// Quando houver mais de um nome com o menor comprimento dentre os nomes na lista, a função 
// deve devolver o primeiro nome com o menor comprimento presente na lista.

package semana11;

import java.util.Arrays;
import java.util.List;

public class VerificaMenorNome {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Barbara", "José", "   bob ", "PATRICK");
        String menorNome = verificaMenorNome(nomes);
        System.out.println(menorNome);
    }

    static String verificaMenorNome(List<String> nomes) {
        
        Integer menor = nomes.get(0).length();
        String menorNome = null;
        
        for (String nome : nomes) {
            nome = nome.trim();
            if (nome.length() < menor) {
                menor = nome.length();
                menorNome = nome;
            }
        }
        String capitalized = menorNome.substring(0, 1).toUpperCase() + menorNome.substring(1).toLowerCase();
        return capitalized;
    }
}