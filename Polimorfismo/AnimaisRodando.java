 package TestePasta;

import java.util.Scanner;

public class AnimaisRodando {

	public static void main(String[] args, Object leia) {
		// TODO Auto-generated method stub

        Scanner leia1 = new Scanner(System.in);
		
		MeuCachorro cachorro = new MeuCachorro();
		MeuCavalo cavalo = new MeuCavalo();
		Preguica preguica = new Preguica();
		
		Animais animal = null;
		
		int x;
		do
		{
			System.out.println("\nVoc� gosta de animais?\nEnt�o esse quis � pra voc�!!!");
			System.out.println("\nQual o tipo do meu animal???\n\n1-Cachorro\n2-Cavalo\n3-Pregui�a\n");
			x = leia1.nextInt();
			if(x==1)
			{
			    animal = cachorro;
				System.out.println("\nD� um nome para o meu cachorro:");
				String nome = leia1.next();
				System.out.println("\nE a idade dele?");
				int idade = leia1.nextInt();
				System.out.println("\nQue som ele faz?");
				String som = leia1.next();
				System.out.println("*******************************************");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
			}
			else if(x==2)
			{
				animal=cavalo;
				System.out.println("\nD� um nome para o meu cavalo:");
				String nome = leia1.next();
				System.out.println("\nD� uma idade a ele:");
				int idade = leia1.nextInt();
				System.out.println("\nHmmm....Qual som ele emite?");
				String som = leia1.next();
				System.out.println("******************************************");
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
			}
			else if(x==3)
			{
				animal=preguica;
				System.out.println("\nD� o nome para a dona pregui�a:");
				String nome = leia1.next();
				System.out.println("\nQuantos anos tem a parente do Sid da Era do Gelo");
				int idade = leia1.nextInt();
				System.out.println("\nAs pregui�as emitem som? Se, sim qual �?");
				String som = leia1.next();
				System.out.println("****************************************************");
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.subirArvores();
			}
			else
			{
				System.out.println("\nAaaaah...voc� n�o colocou a op��o certa :-(");
			}
		}
		while(x<=0 || x>=4);

		
		

		
	}

}
