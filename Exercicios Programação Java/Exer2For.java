package ListaExercicios;

import java.util.Scanner;

public class Exer2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		
		int number, numpar= 0, numimpar = 0;
		
		for(int x = 1 ; x <= 10 ; x ++) { //o int é para que conta possa funcionar no restante do código.
			
			System.out.printf("\nDigite um numero para mim: ");
			number = enter.nextInt();
			if(number% 2 == 0) {
				numpar ++;
			
			}else {
				numimpar ++;
			}
		}
		
		System.out.printf("\nQuantidade de numeros pares: " + numpar);
		System.out.printf("\nQuantidade de numeros pares: " + numimpar);


	}

}
