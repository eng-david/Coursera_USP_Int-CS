// Defina a classe Triangulo cujo construtor recebe 3 valores inteiros correspondentes 
// aos lados a, b e c de um triângulo.

// A classe triângulo também deve possuir um método perimetro, que não recebe parâmetros 
// e devolve um valor inteiro correspondente ao perímetro do triângulo.

// Na classe triângulo, definida na Questão 1, escreva o método tipo_lado() que 
// devolve uma string dizendo se o triângulo é:
// isósceles (dois lados iguais)
// equilátero (todos os lados iguais)
// escaleno (todos os lados diferentes)
// Note que se o triângulo for equilátero, a função não deve devolver isósceles.

// Escreva, na classe Triangulo, o método retangulo() que devolve True se o triângulo for 
// retângulo, e False caso contrário.

// Ainda na classe Triangulo, escreva um método semelhantes(triangulo) que recebe 
// um objeto do tipo Triangulo como parâmetro e verifica se o triângulo atual é semelhante 
// ao triângulo passado como parâmetro. Caso positivo, o método deve devolver True. 
// Caso negativo, deve devolver False
// Um triângulo é semelhante a outro triângulo se a razão (divisão) entre os comprimentos 
// dos seus lados forem iguais.

package semana12;

import java.util.Arrays;
import java.util.List;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 5, 4);
        System.out.println("Perímetro: " + triangulo.perimetro());
        System.out.println(triangulo.tipoLado());
        System.out.println("eh retangulo? " + triangulo.retangulo());
        System.out.println("eh semalhante? " + triangulo.semelhantes(new Triangulo(6,2,4)) );
    }
}

class Triangulo {
    private Integer ladoA, ladoB, ladoC;

    public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Integer perimetro() {
        return ladoA + ladoB + ladoC;
    }

    public String tipoLado() {
        if ((Integer.compare(ladoA, ladoB) == 0) & (Integer.compare(ladoB, ladoC) == 0))
            return "equilátero";
        else if ((Integer.compare(ladoA, ladoB) == 0) | (Integer.compare(ladoB, ladoC) == 0))
            return "isósceles";
        else
            return "escaleno";
    }

    public Boolean retangulo() {
        List<Integer> lados = Arrays.asList(ladoA, ladoB, ladoC).stream().sorted().toList();

        if (Math.pow(lados.get(0), 2) + Math.pow(lados.get(1), 2) == Math.pow(lados.get(2), 2))
            return true;
        else
            return false;
    }

    public Boolean semelhantes(Triangulo outroTriangulo) {
        
        
        List<Integer> lados = Arrays.asList(ladoA, ladoB, ladoC).stream().sorted().toList();
        List<Integer> ladosOutroTriangulo = Arrays.asList(outroTriangulo.ladoA, outroTriangulo.ladoB, outroTriangulo.ladoC).stream().sorted().toList();

        if (    (Double.valueOf(lados.get(0)) / ladosOutroTriangulo.get(0)) == 
                (Double.valueOf(lados.get(1)) / ladosOutroTriangulo.get(1)) &
                (Double.valueOf(lados.get(0)) / ladosOutroTriangulo.get(0)) == 
                (Double.valueOf(lados.get(2)) / ladosOutroTriangulo.get(2))
                )
        return true;
        else return false;
    }
}
