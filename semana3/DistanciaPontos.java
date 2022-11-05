// Receba 4 números na entrada, um de cada vez. Os dois primeiros devem corresponder, respectivamente, às coordenadas x e y de um ponto 
// em um plano cartesiano. Os dois últimos devem corresponder, respectivamente, às coordenadas x e y de um outro ponto no mesmo plano.
// Calcule a distância entre os dois pontos. Se a distância for maior ou igual a 10, imprima longe na saída. Caso o contrário, quando 
// a distância for menor que 10, imprima perto

package semana3;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Ponto p1 = new Ponto(Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine()));
        Ponto p2 = new Ponto(Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine()));
     
        Double distancia = distanciaPontos(p1, p2);

        if (distancia >= 10) System.out.println("longe");
        else System.out.println("perto");

        scan.close();
    }

    private static Double distanciaPontos(Ponto p1, Ponto p2) {
        return Math.sqrt( Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2) );
    }
}

class Ponto {
    private Double x;
    private Double y;

    public Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    
}