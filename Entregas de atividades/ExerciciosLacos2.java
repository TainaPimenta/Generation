package ListaExercicios;

import java.util.Scanner;

public class ExerciciosLacos2 {
	
	private static Scanner n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 float n1, n2, n3;
     
     System.out.println("Digite 3 n�meros");
     try (Scanner leia = new Scanner(System.in)) {
		System.out.print("Digite o primeiro n�mero: ");
		 n1 = leia.nextFloat();

		 System.out.print("Digite o segundo n�mero: ");
		 n2 = leia.nextFloat();

		 System.out.print("Digite o terceiro n�mero: ");
		 n3 = leia.nextFloat();
	}

     if (n1 > n2) 
		{
			 System.out.print("\nA ordem crescente �:"+n1);
		}
		else if (n3 > n1) 
		{
			System.out.print("\nA ordem crescente �:"+n2);
		}
	    else if (n2 > n3) 
	    {
		System.out.print("\nA ordem crescente �:" +n3);
	    }
	   


	}

}
