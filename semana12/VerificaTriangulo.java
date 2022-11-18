
package semana12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4, 2, 5);
        System.out.println("Perímetro: " + triangulo.perimetro());
        System.out.println(triangulo.tipoLado());
        System.out.println("eh retangulo? " + triangulo.retangulo());
        System.out.println("eh semelhante? " + triangulo.semelhantes(new Triangulo(8, 4, 10)));
    }
}

class Triangulo {
    private Integer ladoA, ladoB, ladoC;

    // Defina a classe Triangulo cujo construtor recebe 3 valores inteiros correspondentes
    // aos lados a, b e c de um triângulo.
    public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // A classe triângulo também deve possuir um método perimetro, que não recebe parâmetros
    // e devolve um valor inteiro correspondente ao perímetro do triângulo.

    public Integer perimetro() {
        return ladoA + ladoB + ladoC;
    }

    // Na classe triângulo, definida na Questão 1, escreva o método tipo_lado() que
    // devolve uma string dizendo se o triângulo é:
    // isósceles (dois lados iguais)
    // equilátero (todos os lados iguais)
    // escaleno (todos os lados diferentes)
    // Note que se o triângulo for equilátero, a função não deve devolver isósceles.

    public String tipoLado() {
        if (ladoA == ladoB && ladoB == ladoC)
            return "equilátero";
        else if (ladoA == ladoB || ladoB == ladoC)
            return "isósceles";
        
        return "escaleno";
    }

    // Escreva, na classe Triangulo, o método retangulo() que devolve True se o
    // triângulo for retângulo, e False caso contrário.

    public Boolean retangulo() {
        List<Integer> lados = Arrays.asList(ladoA, ladoB, ladoC).stream().sorted().toList();

        if (Math.pow(lados.get(0), 2) + Math.pow(lados.get(1), 2) == Math.pow(lados.get(2), 2))
            return true;
        
        return false;
    }

    // Ainda na classe Triangulo, escreva um método semelhantes(triangulo) que recebe
    // um objeto do tipo Triangulo como parâmetro e verifica se o triângulo atual é semelhante
    // ao triângulo passado como parâmetro. Caso positivo, o método deve devolver True.
    // Caso negativo, deve devolver False
    // Um triângulo é semelhante a outro triângulo se a razão (divisão) entre os comprimentos dos seus lados forem iguais.

    public Boolean semelhantes(Triangulo triangulo2) {

        List<Double> lados = Arrays.asList(ladoA, ladoB, ladoC).stream().map(Double::valueOf).sorted().toList();
        List<Double> ladosTriangulo2 = Arrays.asList(triangulo2.ladoA, triangulo2.ladoB, triangulo2.ladoC).stream().map(Double::valueOf).sorted().toList();
        
        if (IntStream.range(0, 3).mapToDouble(i -> (lados.get(i) / ladosTriangulo2.get(i))).mapToObj(Double::valueOf).distinct().count() == 1)
            return true;
        
        return false;
    }
}
