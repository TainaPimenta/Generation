package Turma24;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStore {

	public static void main1(String[] args) { 
		// TODO Auto-generated method stub

		
			
			int op;
			try (Scanner read = new Scanner(System.in)) {
				ArrayList<String> estoque = new ArrayList<String>();
				
				do
				{
					System.out.println("\n\t\tColoque uma opção:");
					System.out.println("------------------------------------------");
					System.out.println("\n(1) O que gostaria de adicionar?\n(2) Quer retirar o produto do estoque?"
							+ "\n(3) Produtos Atualizados\n(4) Mostrar todos os produtos do estoque"
							+ "\n(0) Loja fechada!");
					op = read.nextInt();
					
					switch(op)
					{
					case 1:
						read.nextLine();
						System.out.println("\nColoque um produto no estoque: ");
						String produto = read.nextLine();
						estoque.add(produto);
						break;
					case 2:
						read.nextLine();
						System.out.println("\nDigite para remover algo do nosso estoque: ");
						String produto1 = read.nextLine();
						if(estoque.contains(produto1))
						{
							estoque.remove(produto1);
						}
						else
						{
							System.out.println("\nProduto fora de circulação");
						}
						break;
					case 3:
						read.nextLine();
						System.out.println("\nDigite para atualizar: ");
						String verifica = read.nextLine();
						System.out.println("\nDigite para verificar:"+verifica+" : ");
						String novo = read.nextLine();
						if(estoque.contains(verifica))
						{
							estoque.remove(verifica);
							estoque.add(novo);
							
						}
						else
						{
							System.out.println("\nMoça, não tem esse produto aqui!");
						}
						System.out.println(estoque);
						break;
					case 4:
						System.out.println("\nNos temos em estoque: ");
						System.out.println(estoque);
						break;
						default:
							System.out.println("\nLoja fechada!!!");
					}
				}
				while(op!=0);
			}

	}

}
