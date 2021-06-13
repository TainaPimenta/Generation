package ListaExercicios;

import java.util.Scanner;

public class ExerciciosLacos2 {
	
	private static Scanner n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 float n1, n2, n3;
     
     System.out.println("Digite 3 números");
     try (Scanner leia = new Scanner(System.in)) {
		System.out.print("Digite o primeiro número: ");
		 n1 = leia.nextFloat();

		 System.out.print("Digite o segundo número: ");
		 n2 = leia.nextFloat();

		 System.out.print("Digite o terceiro número: ");
		 n3 = leia.nextFloat();
	}

     if (n1 > n2) 
		{
			 System.out.print("\nA ordem crescente é:"+n1);
		}
		else if (n3 > n1) 
		{
			System.out.print("\nA ordem crescente é:"+n2);
		}
	    else if (n2 > n3) 
	    {
		System.out.print("\nA ordem crescente é:" +n3);
	    }
	   


	}

}
