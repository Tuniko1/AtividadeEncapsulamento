package modules;




import java.util.Scanner;

public class Menu {
	
	Produto p = new Produto();
	Scanner sc = new Scanner(System.in);
	
	double preco;
	int qtd;
	int total;
	String descricao;
	public void menuPrincipal() {
	
		
		System.out.println("Escolha a opcao:");
		System.out.println("1 - para Menu de Produtos");
		System.out.println("2 - para Cadastro de Produtos");
		System.out.println("3 - Atualizar Valor Total em Estoque");
		int opcao2 = sc.nextInt();
		
		switch(opcao2) {
		
		case 1:
			menuProdutos();
			break;
			
		case 2:
			menuCadastro();
			break;
		case 3:
			atualizaValor();
			break;
		default: System.out.println("Opção Incorreta!");
		
		
		}
}	
	
	public  void menuProdutos() {
		int opcao;
		
		if (p.getQtd() <= 0){
			System.out.println("Não há produtos cadastrados...\n");
			
			System.out.println("Deseja cadastrar um produto?");
			opcao = sc.next().charAt(0);
			if (opcao == 's'||opcao == 'S') {
				menuCadastro();
			}else {
				menuPrincipal();
			}
		}else {
		
		mostraDados();
		
		
		}		
	}

	public void menuCadastro() {
		if (qtd == 0 ) {
			
		System.out.println("--- Cadastro de Produtos ---");
		System.out.println("----------------------------");
		System.out.println();

		System.out.println("Insira o nome do produto: ");
		
		p.setDescricao(sc.nextLine());
		sc.next();
		
		System.out.println("Insira o preço do produto: ");
		p.setPreco(sc.nextDouble());
		
		System.out.println("Insira a quantidade do produto: ");
		p.setQtd(sc.nextInt());
		
		}else {
			
			System.out.println("--- Cadastro de Produtos ---");
			System.out.println("----------------------------");
			System.out.println();
			
			System.out.println("Insira o nome do produto: ");
			descricao = sc.nextLine();
			p.setDescricao(descricao);
			//sc.next();
			
			System.out.println("Insira o preço do produto: ");
			preco = sc.nextDouble();
			p.setPreco(preco);
			
			System.out.println("Insira a quantidade do produto: ");
			qtd = sc.nextInt();
			p.setQtd(qtd);	
		}
		menuPrincipal();
	}
	
	public void mostraDados() {
		if (total == 0 ) {
			total = p.getQtd();
			qtd = total;
			p.setQtd(qtd);
			p.setvalorTotal(total);
		}else if (total > 0){
			total = p.getvalorTotal();
			qtd = total;
			p.setQtd(qtd);
		}else 
		
		System.out.println("LISTA DE PRODUTO: \n");
		System.out.println(p.getDescricao() +" - " + "R$"+ p.getPreco()+" - " +" Qtd: "+ p.getQtd()+ " | Estoque: "+p.getvalorTotal());
	}
	
	public void atualizaValor() {
		char opcao;
		System.out.println("Deseja atualizar o valor em estoque?");
		opcao = sc.next().charAt(0);
		
		if ((opcao == 's'||opcao == 'S') && p.getQtd() <= 0 ) {
				menuProdutos();
			
		}else if ((opcao == 's'||opcao == 'S') && p.getQtd() >= 1 ) {
			total = p.getQtd();
			p.setvalorTotal(total);
			
			System.out.println("Valor Atual em Estoque: "+p.getvalorTotal());
			System.out.println("Insira o novo valor em estoque: ");
			total = sc.nextInt(); 
			p.setvalorTotal(total);
			
		}else {
			menuPrincipal();
		}
		
			
			
			
		
	}
	

}
