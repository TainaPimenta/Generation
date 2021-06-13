package TestePasta;

public abstract class Animais {

private String reinoAnimal;
	
	abstract public void nome(String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);
	
	public Animais(String reinoAnimal)
	{
		this.reinoAnimal = reinoAnimal;
	}
	
	public String getTipoAnimal() {
		return reinoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal, String reinoAnimal) {
		this.reinoAnimal = reinoAnimal;

		
	}
	protected void subirArvores() {
		// TODO Auto-generated method stub
		
	}
	
}


	