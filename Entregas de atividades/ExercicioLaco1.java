package ListaExercicios;

import java.util.Scanner;

public class ExercicioLaco1 {

	private static Scanner idade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("\nAdivinhe a categoria pela idade:");
		
		int idade;
		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{
		  System.out.print("\nCategoria Infantil");
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.print("\nCategoria Juvenil");
		}
		else if(idade >= 18 && idade <=25)
		{
			System.out.print("\nCategoria Adulto");	
		}	
		

	}

}

