package ListaExercicios;

import java.util.Scanner;

public class Exerc4DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual 
		//a zero.
		//No final, mostre a soma dos n�meros digitados
		
		
		 
		Scanner enter = new Scanner(System.in);	
	
		int numero = 0;
		int soma = 0;
	    
	    
		System.out.println("\nColoque um n�mero");
	    numero = enter.nextInt(); 
	    
	    do {	
			if(numero > 0) {
				soma += numero;
			}
			
			System.out.println("Coloque um n�mero ");
			numero = enter.nextInt();
			
		}while(numero!=0);
		
		System.out.println("A soma dos n�meros foi: " + soma);
	}
}