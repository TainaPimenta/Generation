package ListaExerc�cios;

import java.util.Scanner;

public class ExerciciosLaco3 {
	
	private static Scanner numero;



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
            
        float num1, num2, num3;
        
        System.out.println("Qual ser�o maior n�mero?");
        Scanner leia = new Scanner(System.in);

        System.out.println("Hmmm ser� que � o primeiro?");
        num1 = leia.nextFloat();

        System.out.println("Ou ser� que � o segundo? ");
        num2 = leia.nextFloat();

        System.out.println("Ixi...ser� que � o terceiro? ");
        num3 = leia.nextFloat();
        
        if (num1 > num2 & num1 > num3 ) {         
            System.out.println("O maior n�mero � o " + num1);        
        } else if (num2 > num1 && num2 > num3) {            
           System.out.println("O maior n�mero � o " + num2);       
        } else if (num3 > num1 && num3 > num2) {           
            System.out.println("O maior n�mero � o " + num3);               
        }
           }
}