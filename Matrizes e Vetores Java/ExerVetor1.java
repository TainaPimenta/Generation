package Vetores;

import java.util.Scanner;

public class ExerVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		

		Scanner leia = new Scanner(System.in);
		
		
		int [] vet = {1, 0, 5, -2, -5, 7} ; //O vet seria o valor desses seguintes n�meros
		int somanumeros = vet[0] + vet[1] + vet[5]; 
		
		
		System.out.println("\nA soma entre os valores das posi��es vet[0], vet[1] e vet[5] �: " +somanumeros);

		vet[4] = 100; //Esse seria o valor que est� sendo distribuido.
		
		for (int i = 0;i<5;i++) {
			System.out.println(vet[i]);
		}
		
		 
	
	}

}
