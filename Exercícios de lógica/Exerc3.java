package Turma24;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int h, m, s;
		Scanner leia = new Scanner (System.in);
		System.out.print("\nAdicione aqui o total de segundos do evento:");
		s=leia.nextInt();
		
			
		
		h = s/3600; //Esse já calcula a média total de segundos.
		m = (s%3600)/60;
        s = (s%3600)%60; 
        
        System.out.print("\nO evento teve a duração de: "+h+"h e "+m+"m e "+s+"s.");


   
	}

}
