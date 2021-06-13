package ListaExercicios;

import java.util.Scanner;

public class Exer3While {
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */

		int idade, cont21 = 0, cont50 = 0;

		System.out.printf("\nDigite aqui qualquer idade: ");
		idade = enter.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				cont21++;

			} 
			else if (idade>50) {
				cont50++;
			}

			System.out.printf("\nDigite aqui qualquer idade:");
			idade = enter.nextInt();
		}

		System.out.println("\nQuantidade de pessoas com 21 " + cont21);
		System.out.println("\nQuandtidade de pessoas com 50 anos: " + cont50);
	}
}