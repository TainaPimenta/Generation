package Turma24;

public class Client {

	    private String nome;
	    private String cartao;
	    private int idade;
	    
	    public Client(String nome,String cartao,int idade)
	    {
	        this.nome= nome;
	        this.cartao = cartao;
	        this.idade = idade;
	        
	    }
	    
	    public String getDadosCliente() 
	    {
	        String DadosCliente = nome+" "+cartao+" "+idade;
	        
	        return DadosCliente;
	    }
	} 
