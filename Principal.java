package terminal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	int opcao = 0;
	Estoque estoque = new Estoque();
	Carrinho carrinho = new Carrinho();
	
	//Scanner ler = new Scanner(System.in);
	//System.out.println("Digite uma opção:");
	//opcao = ler.nextInt();
	
	//estoque.addListaProduto();
	//1estoque.addListaProduto();
	Scanner ler = new Scanner(System.in);
	//1opcao = ler.nextInt();

	do {
		
		System.out.println("-----------------MENU-----------------");
		System.out.println("1 - Cadastrar produtos                |");
		System.out.println("2 - Adicionar no carrinho           |");
		System.out.println("3 - Remover do carrinho             |");
//		System.out.println("4 - Finalizar compra             |");
//		System.out.println("5 - Consultar pedido             |");
//		System.out.println("6 - Listar compras realizadas             |");
		System.out.println("7 - Mostrar estoque             |");

		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			estoque.addProdutoEstoque();
			break;
		
		case 2:
			System.out.println("Qual produto deseja adicionar? ");
			String produto = ler.nextLine();
			System.out.println("Qual quantidade ?");
			int qtd = ler.nextInt();
			Produto p = new Produto(produto,qtd);
			try {
				carrinho.addCarrinho(p,qtd);
			} catch(Limite_Excedido_Exception e) {
				System.out.println("Erro ao inserir no carrinho: " + e.getMessage());
			}
			break;
			
		case 3:
			carrinho.removerCarrinho();
			break;
			
		case 4:
			carrinho.listaCarrinho();
			System.out.println("Deseja confirmar a compra?(s/n)");
			String opc = ler.nextLine();
			if(opc == "sim") {
				//finalizarCompra
			} else {
				break;
			}
			break;
		
		case 7:
			estoque.listarProdutos();
			break;
			
		default:
			//
		}
		//estoque.buscaProduto();
		
		
	}while(opcao !=0);
}
}