package Turma24;

public class Aviao {

	   private String nomeAviao;
	    private String tamanho;
	    private String companhia;
	    
	    public Aviao (String nomeAviao,String tamanho,String companhia)
	    {
	        this.nomeAviao= nomeAviao;
	        this.tamanho= tamanho;
	        this.companhia = companhia;
	        
	    }
	    
	    public String getDadosAviao() 
	    {
	        String DadosAviao = nomeAviao+" "+tamanho+" "+companhia;
	        
	        return DadosAviao;
	    }
}
