package Turma24;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int anos, meses, dias, totaldias; 
			
		   Scanner leia = new Scanner(System.in);
			
	       System.out.print("\nDigite os anos: ");
	       anos = leia.nextInt();
	       
	       System.out.print("\nDigite os meses: ");
	       meses = leia.nextInt();
	       
	       System.out.print("\nDigite os dias:");
	       dias = leia.nextInt();
	       
	       totaldias = anos * 365 + meses * 30 + dias;
	        System.out.println("\nTotal de dias: "+totaldias);
	       
	

	}

}
