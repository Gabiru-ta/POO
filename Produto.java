package terminal;

public class Produto {
	//private int cod;
	private String nome;
	private int quantidade;
	private double valor;
	private int tempoEntrega;
	
	public Produto(String nome, int quantidade, int valor, int tempoEntrega) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tempoEntrega = tempoEntrega;
	}
	
	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public Produto() {

	}

	public int getTempoEntrega() {
		return tempoEntrega;
	}
	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}
