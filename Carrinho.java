package terminal;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
	private int numeroPedido;
	private int valorCompra;
	//private Item item;
	//private Produto produto= new Produto();
	//private List<Produto> produtos;
	//private ArrayList<Produto> produtos;
	private ArrayList<Produto> produtoComprar;
	private ArrayList<Item> itens = new ArrayList<Item>();
	private Item i;
	
	/*Teste
		public void addCarrinho(Produto produto,int valor,int qtd){
			Item n = new Item(produto,valor,qtd);
			this.itens.add(n);
			
			*/
	
		public void addCarrinho(Produto produto, int qtd) {	
			Item n = new Item(produto,qtd);
			addItem(n);
		}
			
		public boolean remove(Produto produto){
			for(Item x : this.itens){
			if(x.getProduto() == produto){
			this.itens.remove(x);
			return true;
		}
		}
		return false;
		}
		
		/*
		/*public void addItem(Produto produto,int qtd){
		 *	 Item item = get.Item(produto);
		 * 	if(item != null){
		 * 		atualizaQTD(produto,item.getQTD() + qtd;
		 * 
		 * }else{
		 * 		getItens().add(new Carrinho(produto,qtd);
		 * 		calcTotal();
		 * }
		 * 
		 * }
		 *
		 *public void atualizaQTD(Produto produto,int nova_qtd){
		 *		Item i = getItem(produto);
		 *		item.atualizaQTD(n_qtd);
		 *		calcTotal();
		 *}
		 *
		 * public void calTotal(){
		 * 		t = 0;
		 * 		for(Item x: getItens()){
		 * 		t += x.getPrecoTotal();[
		 * 		}
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		 * public void add(Produto produto, int qtd){
		 * 		itens.add(produto);
		 * 
		 * }
		 */
	
		//TESTESTSETEST
		/*public Carrinho{
		 * 	this.produtos = new ArrayList<Produto>();
		 * }
		 * 
		 * public void addProduto(Produto produto){
		 * 	produtos.add(Produto);
		 * }
		 * 
		 * public void removeProduto(Produto produto){
		 * 	this.produtos.remove(produto);
		 * }
		 * 
		 * public double getTotal() {
        double soma = 0;
        for(Produto p:this.produtos){
            soma+=p.getPreco();
        }
        this.total = soma;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
		 * 
		 * 
		 * 
		 */
		
		/* TESTE
		public void removeCarrinho(Item item){
			
		public Carrinho(){
			this.itens = new ArrayList<>();
		}
		public void addProduto(Produto produto){
			item n = new Item(Produto);
			itens.add(n);
			
		}
		public void add(Produto produto,int qtd){
			add(produto);
		
		}
		public int getQTDProduto(Produto produto){
		item x = new Item(Produto);
		int indice = itens.indexof(x);
		return itens.get(indice).getqtd();
		}
		
		
		*/
		/*public Carrinho(){
		 * 	produtos = new ArrayList<>();
		 * 
		 * }
		 * public void addProduto(Produto produto){
		 * 	produtos.add(produto);
		 *}
		 *public remove(String nome){ 
		 *	for(Produto x : this.produtos){
		 *		if(x.getNome()==nome){
		 *		this.produtos.remove(x);
		 *		}	
		 *	}
		 *}
		 *public void mostraTudo(){
		 *	for(Produto p : this.produtos){
		 *	System.out.println(p);	
		 *	}
		 *} 
		 * 
		 * public int CalPreco(){
		 * 	int t=0;
		 * 		for(Produto p:this.produtos){
		 * 			t += p.getPreco();		
		 * 		}
		 * 		return t;
		 * }
		 * 
		 * 
		 */
	
		/*
		}
	*/
	
	/*
	 * public removeItem(Produto produto){
	 * 		itens.remove(new Item(produto));
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	public Carrinho(ArrayList<Item> itens,int numeroPedido) {
		this.itens = itens;
		this.numeroPedido = numeroPedido;
	}
	

	public Carrinho() {
		itens = new ArrayList<Item>();
	}

	/*public double subTotal(){
	 * 		return produto.get()*qtd;
	 * }
	 * 
	 * public void atualizaQTD(){
	 * 		setqtd(getqtd()+1);
	 * }
	 * 
	 * 
	 */
	
	
	public void addCarrinho(Produto produto,int valor_unitario,int qtd) throws Limite_Excedido_Exception{
		if(qtd > 10) {
			throw new Limite_Excedido_Exception("Limite de apenas 10 produtos");
		} else {
			Item novo = new Item(produto,qtd);
			this.itens.add(novo);
		}
	}
	
	public void addCarrinho(Item item) {
		itens.add(item);//PRODUTO EXISTE EXCEPTION
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public void addItem(Item item) {
		itens.add(item);
	}
	
	public void removeItem(Item item) {
		itens.remove(item);
	}
	
	public double calculaPreco() {
		double p = 0;
		for(Item x: itens) {
			p += x.getProduto().getValor() * x.getQtd();
		}
		return p;
	}
	
	
	
	
	
	
	
	/*
	public void addCarrinho(Produto p) {
		
		produtoComprar.add(p);
	}
	*/
	public void removerCarrinho() {
		Scanner ler = new Scanner(System.in);
		String produtorremover;
		System.out.println("Qual produto você deseja remover ?");
		for(int i = 0;i < produtoComprar.size(); i++ ) {
			System.out.printf("%s\n",produtoComprar.get(i).getNome());
		}
		produtorremover = ler.nextLine();
		//TESTE FOR EACH 
		
		for(Produto x : produtoComprar) {
			if(x.getNome().equals(produtorremover)) {
				produtoComprar.remove(x);
			}
		}
		
		
		/*
		int i;
		for(i =0; i < produtoComprar.size() && produtorremover != produtoComprar.get(i).getNome(); i++) {
			System.out.printf("Procurando... ");
		}
		
		
		produtoComprar.remove(i);
		*/
		//while(produtorremover != produtoComprar.)
		//cliente 
	}
	
	public void listaCarrinho() {
		if(this.produtoComprar.size() == 0) {
			System.out.println("\n         NÃO TEM PRODUTO NO CARRINHO");
		}
		for(int i =0; i < produtoComprar.size(); i++) {
			System.out.printf("Produto: %s, valor: %d, quantidade, %d\n", 
					this.produtoComprar.get(i).getNome(),
					this.produtoComprar.get(i).getValor(),
					this.produtoComprar.get(i).getQuantidade());
		}
	}
	
	
}
