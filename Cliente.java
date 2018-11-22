package terminal;

public class Cliente {
	private String nome;
	private int ID;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public Cliente(String nome, int iD) {
		super();
		this.nome = nome;
		ID = iD;
	}
}
