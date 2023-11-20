package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionCores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Criar Array
		ArrayList<String> cores = new ArrayList<String>();
		
		// Leitura do Array
		for(int i=0;i<5;i++) {
			System.out.println("\nDigite a cor número "+(i+1)+" : ");
			cores.add(scan.nextLine());
		}
		
		// Transformando array em interator
		Iterator<String> iterator = cores.iterator();
		
		// Listando as cores
		while(iterator.hasNext()) {
			System.out.println("\n"+iterator.next());
		}
		
		// .sort método para ordenar
		// Listando as cores em ordem alfabética
		Collections.sort(cores);
		System.out.println("\nCores ordenadas");
		System.out.println("\n"+cores);
		
		

	}

}
