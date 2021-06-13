package ListaExercícios;

import java.util.Scanner;

public class ExerciciosLaco3 {
	
	private static Scanner numero;



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
            
        float num1, num2, num3;
        
        System.out.println("Qual seráo maior número?");
        Scanner leia = new Scanner(System.in);

        System.out.println("Hmmm será que é o primeiro?");
        num1 = leia.nextFloat();

        System.out.println("Ou será que é o segundo? ");
        num2 = leia.nextFloat();

        System.out.println("Ixi...será que é o terceiro? ");
        num3 = leia.nextFloat();
        
        if (num1 > num2 & num1 > num3 ) {         
            System.out.println("O maior número é o " + num1);        
        } else if (num2 > num1 && num2 > num3) {            
           System.out.println("O maior número é o " + num2);       
        } else if (num3 > num1 && num3 > num2) {           
            System.out.println("O maior número é o " + num3);               
        }
           }
}