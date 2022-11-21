// Este exercício tem duas partes:
// 1. Implemente a função incomodam(n) que devolve uma string contendo "incomodam " (a palavra seguida de 
// um espaço) n vezes. Se n não for um inteiro estritamente positivo, a função deve devolver uma string vazia. 
// Essa função deve ser implementada utilizando recursão.

// 2. Utilizando a função acima, implemente a função elefantes(n) que devolve uma string contendo a letra da 
// música "Um elefante incomoda muita gente" de 1 até n elefantes. Se n não for maior que 1, a função deve 
// devolver uma string vazia. Essa função também deve ser implementada utilizando recursão.

package semana15;

public class Elefantes {
    public static void main(String[] args) {
        System.out.println(elefantes(3));
    }

    public static String incomodam(Integer n) {
        if (n == 0)
            return "";
        return "incomodam " + incomodam(n - 1);
    }

    public static String elefantes(Integer n) {
        if (n == 0)
            return "";
        if (n == 1)
            return "Um elefante incomoda muita gente\n";
        else
        return elefantes(n - 1) + n.toString() + " elefantes " + incomodam(n) + "muito mais\n" + n.toString() + " elefantes incomodam muita gente\n";
    }
}
