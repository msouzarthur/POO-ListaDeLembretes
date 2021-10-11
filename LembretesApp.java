/**
 * 
 */
package ListadeLembretes;

import java.util.Scanner;

/**
 * @author Arthur Machado de Souza - 19102583
 * Engenharia de Computação - POO
 */
public class LembretesApp {

	public static void menu() {
		try (Scanner entrada = new Scanner(System.in)) {
			int i, opcao = 0;
			String auxiliar;
			BlocoDeLembretes dados = new BlocoDeLembretes();
			while(opcao!=6)
			{
				System.out.println("Lembretes App - A lista contém "+dados.numeroDeLembretes()+" lembretes");
				System.out.println("Escolha uma das seguintes opções:");
				System.out.println("1 - Adicionar novo lembrete");
				System.out.println("2 - Remover lembrete");
				System.out.println("3 - Listar");
				System.out.println("4 - Busca por data");
				System.out.println("5 - Busca por nome");
				System.out.println("6 - Sair");
				opcao = entrada.nextInt();
				switch(opcao)
				{
					case 1:
						dados.incluirLembrete(null);
						break;
					case 2:
						System.out.println("Insira o índice a ser excluido: ");
						i = entrada.nextInt();
						dados.removerLembrete(i);
						break;
					case 3:
						dados.listarLembretes();
						break;
					case 4:
						System.out.println("Formato armazenado: dd-mm-aa");	
						System.out.println("Digite a data: ");
						auxiliar = entrada.next();
						dados.buscarLembretesPorData(auxiliar);
						break;
					case 5:
						System.out.println("Digite o nome: ");
						auxiliar = entrada.next();
						dados.buscarLembretesPorNome(auxiliar);
						break;
					case 6:
						System.out.println("Saindo");
						return;
					default:
						System.out.println("Opção não reconhecida");
				}
			}
		}
	}
	public static void main(String[] args) {
		menu();
	}		
}
