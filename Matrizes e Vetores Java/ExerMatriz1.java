package Matrizes;

import java.util.Scanner;

public class ExerMatriz1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner read = new Scanner(System.in);
		
		int c=0, l=0;
		int soma = 0; //Soma Matriz
		int[][]m = new int [3][3]; //dificuldade para encontrar a matriz, coloquei "m" para que o programa possa lê-la
		 
		 for(c = 0; c < 3; c++) {
			 for(l = 0; l < 3; l++) {
				 
	             System.out.printf("\nEntre com o número da linha %d e coluna %d: ", c+1, l+1);
				 m[c][l] = read.nextInt();
				 
				 if(m [c][l] > 10) { //o programa está lendo numeros maiores que 10
						soma++; //
					}
				}
			}
		 
			System.out.println("\nA matriz possui: "+soma+" casas com numeros maiores que 10.");

		
	}

}
