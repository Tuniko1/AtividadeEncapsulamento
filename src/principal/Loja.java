package principal;
import java.util.Scanner;
import modules.Menu;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu m = new Menu();
		char opcao;
		 
		System.out.println("Abrir Aplicativo SuperMercado?");
		opcao = sc.next().charAt(0);
		if (opcao == 's'|| opcao =='S') {
			
			do {
				
				System.out.println("\nMostrar o menu?");
				opcao = sc.next().charAt(0);
					if (opcao == 's'||opcao == 'S') {
						m.menuPrincipal();
						
				}else {
					System.out.println("Encerrando...");
					
					sc.close();
					}
			}while(opcao == 's');
				}else {
					System.out.println("Encerrando...");
			
			System.exit(0);
		}
		
		
		
		
		

	}

}
