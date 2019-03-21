public class Empresa{
	
	private String name;
	private int nit;

	public Empresa(){

	}

	public Empresa(String name){
		this.name = name;
	}
	
	public Empresa(String name, int nit){
		this.name = name;
		this.nit = nit;
	}
	
	public void setName(String name){
		this.name = name;
	}

}
