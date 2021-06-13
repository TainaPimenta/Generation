package Turma24;

public class Funcionario {

	    private String nome;
	    private String registro;
	    private String loja;
	    
	    public Funcionario(String nome,String registro,String loja)
	    {
	        this.nome= nome;
	        this.registro= registro;
	        this.loja = loja;
	        
	    }
	    
	    public String getDadosFuncionario() 
	    {
	        String DadosFuncionario = nome+" "+registro+" "+loja;
	        
	        return DadosFuncionario;
	    }
}

