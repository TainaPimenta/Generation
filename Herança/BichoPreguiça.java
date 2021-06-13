package TestePasta;

public class BichoPreguiça extends Animal {

	private String nome;
	private int idade;
	
	public BichoPreguiça(String nome, int idade)
	{
		super (nome,idade);
		this.nome = nome;
		this.idade = idade;
	}
	
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade dele: "+getIdade());
	}

}
