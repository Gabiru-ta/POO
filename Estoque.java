package terminal;

import java.util.ArrayList;
import java.util.Scanner;

import org.xml.sax.ext.LexicalHandler;

public class Estoque {
	
public ArrayList<Produto> produtoLista = new ArrayList<>();
//public Estoque(){
//produtoLista = new ArrayList<>();
//}


	private Boolean verificaSenha() {
		Scanner ler = new Scanner(System.in);
		int senha;
		System.out.println("Digite a senha:");
		senha = ler.nextInt();
		if(senha == 123) {
			return true;
		}else {
			System.out.println("Digite uma senha válida");
			return false;
		}
	}
	
	public void addProdutoEstoque() throws Produto_Existe_Exception{
		
		if(this.verificaSenha()) {
			
			Produto p = new Produto();
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do produto:");
			p.setNome(ler.nextLine());
			System.out.println("Digite o valor do produto:");
			p.setValor(ler.nextInt());
			System.out.println("Digite o quantidade do produto:");
			p.setQuantidade(ler.nextInt());
			System.out.println("Digite o tempode de entrega do produto:");
			p.setTempoEntrega(ler.nextInt());
			
			for(Produto x : this.produtoLista) {
				if(x.getNome().equals(p.getNome())) {
					throw new Produto_Existe_Exception("Produto já cadastrado");
				} else
					this.produtoLista.add(p);

			}		
		//TESTE 
	/*		Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do produto");
			String nome = ler.nextLine();
			System.out.println("Digite o valor do produto");
			Integer valor = ler.nextInt();
			System.out.println("Digite a quantidade a ser adicionada");
			Integer quantidade = ler.nextInt();
			System.out.println("Digite o tempo de entrega do produto(em dias)");
			Integer tempo = ler.nextInt();
			
			produtoLista.add(new Produto(nome,valor,quantidade,tempo));
			*/
		}
	}
	
	public void listarProdutos() {
		if(this.produtoLista.size() == 0) {
			System.out.println("\n         NÃO TEM PRODUTO REGISTRADO");
		}
		for(int i =0;i < this.produtoLista.size();i++) {
			System.out.printf("Produto: %s, valor: %d, quantidade, %d | tempo de entrega: %d dias\n", 
					this.produtoLista.get(i).getNome(),
					this.produtoLista.get(i).getValor(),
					this.produtoLista.get(i).getQuantidade(),
					this.produtoLista.get(i).getTempoEntrega());
		}
		System.out.println();
	}

	public void buscaProduto() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual produto você procura: ?");
		String nomeProduto = ler.nextLine();
		for(Produto x : this.produtoLista) {
			if(x.getNome() == nomeProduto) {
				System.out.println("Produto se encontra no estoque");
			} else
			{
				System.out.println("Produto não se econtra no estoque");
			}
		}
	}
	
	public void verifica_Estoque() {
		
	}
	
}
