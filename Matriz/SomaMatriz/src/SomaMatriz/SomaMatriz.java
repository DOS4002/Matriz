package SomaMatriz; 
	import java.util.Scanner;
	public class SomaMatriz {
	    public static void main(String[] args) {
	        int[][] matriz = new int[4][2];
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        for (int i = 0; i < matriz.length; i++) {
	            int soma = 0;
	            for (int j = 0; j < matriz[i].length; j++) {
	                soma += matriz[i][j];
	            }
	            System.out.println("Soma da linha " + (i+1) + ": " + soma);
	            System.out.prinln();
	        }
	    }
	}


