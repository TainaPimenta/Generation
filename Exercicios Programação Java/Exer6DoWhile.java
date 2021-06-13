package ListaExercicios;

import java.util.Scanner;

public class Exer6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);	
		
		int numero, Soma = 0, cont = 0;
		float media;

		System.out.println("Digite o valor do numero: ");
		numero = read.nextInt();

		do {
			if (numero > 0) {
				if (numero % 3 == 0) {
					Soma += numero;
					cont++;
				}
			}

			System.out.println("Digite o valor do numero: ");
			numero = read.nextInt();

		} while (numero != 0);

		media = Soma / cont;

		System.out.printf("A média dos numeros multiplos de 3 eh: %.2f%n", media);


		
			
	    	
		
	}

}
