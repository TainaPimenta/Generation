package Turma24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class EstoqueLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3-	Crie  um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

                Armazenar dados da List
                Remover dados da list;
                Atualizar dados da list.
                Apresentar todos os dados da list.*/
		
		    List<Integer> MeusProdutos = new ArrayList<Integer>();
		
		MeusProdutos.add(1);
		MeusProdutos.add(2);
		MeusProdutos.add(3);
		MeusProdutos.add(4);
		MeusProdutos.add(5);
		MeusProdutos.add(6);
		
		for(Integer chacklist:MeusProdutos) {
			
			System.out.println(MeusProdutos);

		}
		
		MeusProdutos.remove(0); //Irá remover um dos produtos da lista a cima.
		System.out.println(MeusProdutos);
		for(Integer Produto : MeusProdutos) {
			System.out.println(Produto);
		}
		
		System.out.println("\nPreciso que remova um produto");
		System.out.println();
		MeusProdutos.remove(0);

			
		
		for(Integer chacklist:MeusProdutos)
		{
			System.out.println(chacklist);
		}
		
		int primeiroElemento = MeusProdutos.get(0); 
		System.out.println("\nColoque o primeiro produto da loja: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<MeusProdutos.size();i++) //usando esse tipo de laço for para adc "MeusProdutos"
		{
			System.out.println("\nElemento: "+MeusProdutos.get(i));
		}
		
		Collections.sort(MeusProdutos); //Ordena uma lista de elementos que implementam a interface comparável.
		System.out.println("\nVocê colocou os produtos assim: ");
		System.out.println(MeusProdutos);
		
		System.out.println();
		
		Set<Integer> Organizando = new HashSet<Integer>();
		
		
		Organizando.add(6); //a lista será mostrada de forma descrescente
		Organizando.add(3);
		Organizando.add(5);
		Organizando.add(1);
		Organizando.add(2);
		Organizando.add(4);
		
		Iterator<Integer> iOrganizando = Organizando.iterator();
		
		while(iOrganizando.hasNext())
		{
			System.out.println(iOrganizando.next());
			
		}

	}
	
}
