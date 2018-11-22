package terminal;

public class Item {
	//private int cod;
	private Produto produto;
	private int qtd;
	private double precoTotal;
	private double preco_unitario;
	
	public Item() {
		
	}
	
	/*
	 * public Item(Produto produto,int qtd){
	 * 	this.produto = produto;
	 * 	this.qtd = 1;
	 * }
	 */
	
	public Item(Produto produto, int qtd) {
		this.produto = produto;
		this.preco_unitario = produto.getValor();
		this.qtd = qtd;
		CalculaTotal();
	}

	public Item(Produto produto) {
		this.produto = produto;
	}
	

	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void addCarrinho(int qtd) {
		this.qtd += qtd;
	}
	
	public void CalculaTotal() {
		precoTotal = preco_unitario * qtd;
	}
	
	public void atualizaQTD(int nova_qtd) {
		this.qtd = nova_qtd;
		CalculaTotal();
	}
	
	/*
		public int getCod(){
			return cod;
		}
	
		public setCod(int cod){
			this.cod = cod;
		}
	
	*/
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
