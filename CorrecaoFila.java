package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CorrecaoFila {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do {
			
			// Cirando um menu
			System.out.println("\n******************************************");
			System.out.println("\n1- Adicionar clientes na fila");
			System.out.println("\n2- Listar todos os clientes da fila");
			System.out.println("\n3- Retirar clientes da fila");
			System.out.println("\n0- Sair");
			System.out.println("\n******************************************");
			System.out.println("\nEntre com a opção desejada: "); 
			op = scan.nextInt();
			
			// Trabalhando com as opções
			switch(op) {
			case 1:
				scan.nextLine(); // Limpa o cash
				System.out.println("\nDigite seu nome: ");
				String nome = scan.nextLine();
				if(nome.isEmpty()) {
					System.out.println("\nO nome não foi adicionado na fila...");
				}else {
					fila.add(nome); // Adiciona nome na fila
					System.out.println("\nCliente adicionado....\n");
				}
				break;
			case 2:
				scan.nextLine();
				System.out.println("\nLista de clientes da fila..."); // Imprimindo a lista
				
				// Criando o interator e rodar o interator
				for(Iterator<String> it = fila.iterator();it.hasNext();) {
					System.out.println(it.next());
				}
				break;
			
			case 3:
				scan.nextLine();
				// Verificando se a fila está vazia
				if(fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia...");
				}else {
					System.out.printf("\nO (a) cliente %s foi chamado(a)!", fila.poll());
					System.out.println("znFila: \n");
					// Imprimindo a fila usando interator local
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
				}
				break;
				
			case 0:
				System.out.println("znPrograma finalizado...");
				break;
				
				default:
					System.out.println("\nOpção inválida!!!");
			
			}
			
			
			
			
		}while(op !=0);
		
		
	}

}
