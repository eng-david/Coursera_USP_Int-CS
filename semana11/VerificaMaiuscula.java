// Escreva a função maiusculas(frase) que recebe uma frase (uma string) como parâmetro e devolve 
// uma string com as letras maiúsculas que existem nesta frase, na ordem em que elas aparecem.


package semana11;

public class VerificaMaiuscula {
    public static void main(String[] args) {
        String frase = "Testando Detector De Letras Maiusculas";
        String maiusculas = verificaMaiuscula(frase);
        System.out.println(maiusculas);
    }

    static String verificaMaiuscula(String frase) {
        StringBuilder sb = new StringBuilder(frase.trim());
        StringBuilder maiusculas = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) {
            Character character = sb.charAt(i);
            if (Character.isUpperCase(character)) maiusculas.append(character);
        }
        return maiusculas.toString();
    }
}