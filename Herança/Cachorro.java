package TestePasta;

public class Cachorro extends Animal{

	private String nome;
	private int idade;
	
	public Cachorro(String nome, int idade)
	{
		super (nome,idade);
		this.nome = nome;
		this.idade = idade;
	}
	
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade dele: "+getIdade());
	}

}


	