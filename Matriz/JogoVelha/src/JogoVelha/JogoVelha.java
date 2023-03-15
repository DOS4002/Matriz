package JogoVelha;
import java.util.Scanner;
public class JogoVelha {
	public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        int jogadasRestantes = 9;
        boolean jogoAcabou = false;
        char jogadorAtual = 'X';
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        while (!jogoAcabou) {
   
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("É a vez do jogador " + jogadorAtual + ":");
            System.out.println();
            System.out.print("Digite a linha da jogada: ");
            int linha = scanner.nextInt();
            System.out.println();
            System.out.print("Digite a coluna da jogada: ");
            int coluna = scanner.nextInt();
            System.out.println();

      
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente.");
            } else {
 
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadasRestantes--;

         
                if ((tabuleiro[linha][0] == jogadorAtual && tabuleiro[linha][1] == jogadorAtual && tabuleiro[linha][2] == jogadorAtual) ||
                    (tabuleiro[0][coluna] == jogadorAtual && tabuleiro[1][coluna] == jogadorAtual && tabuleiro[2][coluna] == jogadorAtual) ||
                    (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                    (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
                    System.out.println("O jogador " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (jogadasRestantes == 0) {
                    System.out.println("Empate!");
                    jogoAcabou = true;
                } else {
                
                    jogadorAtual = jogadorAtual == 'X' ? 'O' : 'X';
                }
            }
        }

        System.out.println();
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print (i + " ");
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
        }
}
