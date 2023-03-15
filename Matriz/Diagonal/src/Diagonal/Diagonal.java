package Diagonal;
import java.util.Scanner;
public class Diagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
