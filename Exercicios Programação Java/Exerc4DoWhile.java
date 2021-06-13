package ListaExercicios;

import java.util.Scanner;

public class Exerc4DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5-Crie um programa que leia um número do teclado até que encontre um número igual 
		//a zero.
		//No final, mostre a soma dos números digitados
		
		
		 
		Scanner enter = new Scanner(System.in);	
	
		int numero = 0;
		int soma = 0;
	    
	    
		System.out.println("\nColoque um número");
	    numero = enter.nextInt(); 
	    
	    do {	
			if(numero > 0) {
				soma += numero;
			}
			
			System.out.println("Coloque um número ");
			numero = enter.nextInt();
			
		}while(numero!=0);
		
		System.out.println("A soma dos números foi: " + soma);
	}
}