// Você conhece o jogo do NIM? Nesse jogo, n peças são inicialmente dispostas numa mesa ou tabuleiro. Dois jogadores jogam  alternadamente, retirando pelo menos 1 e no máximo m peças cada um. Quem tirar as últimas peças possíveis ganha o jogo.
// Existe uma estratégia para ganhar o jogo que é muito simples: ela consiste em deixar sempre múltiplos de (m+1) peças ao jogador oponente.

package semana6;

import java.util.Scanner;

public class JogoDoNim {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bem-vindo ao jogo do NIM! Escolha:");
        System.out.println("");
        System.out.println("1 - para jogar uma partida isolada");
        System.out.println("2 - para jogar um campeonato");

        // Scanner scan = new Scanner(System.in);
        Integer escolhaInicial;
        do {
            escolhaInicial = Integer.parseInt(scan.nextLine());
        } while (escolhaInicial != 1 & escolhaInicial != 2);

        Human human = new Human(scan);
        Computer computer = new Computer();

        if (escolhaInicial == 1) {
            System.out.println("Voce escolheu uma partida isolada!\n");
            partida(human, computer);
        } else {
            System.out.println("Voce escolheu um campeonato!\n");
            campeonato(human, computer);
        }
    }

    static void campeonato(Human human, Computer computer) {

        for (int i = 1; i <= 3; i++) {
            System.out.println(" **** Rodada " + i + " ****\n");
            partida(human, computer);
        }

        System.out.println("**** Final do campeonato! ****\n");
        System.out.println("Placar: Você " + human.getScore() + " X " + computer.getScore() + " Computador\n");
    }

    static void partida(Human human, Computer computer) {
        Integer n = 0, m = 0, retirada = 0;
        entity turnEntity;

        while (n <= 0) {
            System.out.print("Quantas peças: ");
            n = Integer.parseInt(scan.nextLine());
        }

        while (m <= 0 || m > n) {
            System.out.print("Limite de peças por jogada? ");
            m = Integer.parseInt(scan.nextLine());
        }

        if ((n % (m + 1)) == 0) {
            System.out.println("Você começa!");
            turnEntity = human;
        } else {
            System.out.println("O computador começa!");
            turnEntity = computer;
        }

        while (n > 0) {
            if (turnEntity == computer) {
                retirada = computer.play(n, m);
                n -= retirada;
                if (retirada == 1)
                    System.out.println("O computador tirou uma peça.");
                else
                    System.out.println("O computador tirou " + retirada + " peças.");
                if (n == 0) {
                    System.out.println("Fim do jogo! O computador ganhou!\n");
                    computer.score();
                }
                turnEntity = human;

            } else if (turnEntity == human) {
                retirada = human.play(n, m);
                n -= retirada;
                if (retirada == 1)
                    System.out.println("Você tirou uma peça.");
                else
                    System.out.println("Você tirou " + retirada + " peças.");
                if (n == 0) {
                    System.out.println("Fim do jogo! Você ganhou!\n");     
                    human.score();
                }
                turnEntity = computer;
            }

            if (n > 0) {
                if (n == 1)
                    System.out.println("Agora resta apenas uma peça no tabuleiro.");
                else
                    System.out.println("Agora restam " + n + " peças no tabuleiro");
            }
        }

    }

}

class Human implements entity {

    private Integer score = 0;
    private Scanner scan;

    public Human(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public Integer play (Integer n, Integer m) {
        
        Integer retirada = 0;
        Boolean erro = false;
        do {
            System.out.print("Quantas peças você vai tirar? ");
            retirada = Integer.parseInt(scan.nextLine());
            erro = (retirada > n || retirada > m || retirada <= 0);
            if (erro)
                System.out.println("Oops! Jogada inválida! Tente de novo.\n");
        } while (erro);

        return retirada;
    }

    @Override
    public void score() {
        this.score += 1;
    }

    public Integer getScore() {
        return score;
    }

}

class Computer implements entity {

    private Integer score = 0;

    @Override
    public Integer play (Integer n, Integer m) {
        // Deixar o usuario com n+1 peças
        Integer retirada = n - (m + 1);

        if (retirada > m || retirada < 1) {
            // Tira o numero maximo de peças possível
            if (n < m)
                retirada = n;
            else
                retirada = m;
            // Evitar que na prox jogada o usuario possa deixar o computador com m+1 peças e
            // verificar se o computador já ganhou o jogo
            if (!((n - retirada) > ((2 * retirada) + 1)) & !((n - retirada) == 0)) {
                retirada = n - (2 * m) - 2;
                if (retirada < 1)
                    retirada = m;
            }
        }
        return retirada;
    }

    @Override
    public void score() {
        this.score += 1;
    }

    public Integer getScore() {
        return score;
    }
}
