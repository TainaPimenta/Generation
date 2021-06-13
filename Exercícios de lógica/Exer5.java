package Turma24;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, media=0; 
		
		   Scanner leia = new Scanner(System.in);
			
	       System.out.print("\nEntre com a nota1: ");
	       n1= leia.nextInt();
	       
	       System.out.print("\nEntre com a nota2: ");
	       n2= leia.nextInt();
	       
	       System.out.print("\nEntre com a nota3: ");
	       n3= leia.nextInt();
	       
	       media = (n1 * 2) + (n2 * 3) + (n3 * 5);
	        System.out.println("\nA média foi: "+ media);


	}

}
