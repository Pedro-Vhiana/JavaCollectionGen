package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListArmazenarNotas {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(2.0);
		notas.add(8.0);
		
		
		// Mostrar na tela todas as notas inseridas e tranformar a notas em string com o método .toString()
		System.out.println("\nNotas cadastradas: "+ notas.toString());
		
		// Mostra uma determinada nota existente na lista usando o método .contains( Informe a nota armazenada )
		System.out.println("\nA nota 5 existe na lista? "+ notas.contains(5d));
		
		// Atualizar uma nota da lista através do método Set
		// No parametro Informar a posição do valor que será alterado e logo após a vírgula informar o novo valor
		notas.set(1, 6.0); // Utilizando set para alterar o valor armazenado dentro da lista em uma determinada posição
		System.out.println("\nA nota 5 foi alterada para 6: "+ notas.toString()); // transformar notas em String quando quiser exibir
				
		// Removendo uma nota da lista, através do método remove
		notas.remove(1);
		System.out.println("\nA nota 6 foi removida: "+ notas.toString());
		
		// Plus+ Métodos que podemos trablahar com ArrayList
			// .isEmpty == Checa se a lista está vazia
				System.out.println("\nA lista está vazia? "+notas.isEmpty());
			// .size == Exibe o tamanho da lista ( numero de elementos armazenados )
			// Conta apartir do 1 não do 0.
				System.out.println("\nO tamanho da lista é: "+notas.size());
			// .max == Exibe o maior valor da lista
			// Puxando a biblioteca que existe esse método e dentro do parametro escolher a Arraylist para exibir o maior valor
				System.out.println("\nO maior valor da lista é: "+ Collections.max(notas));
			// .min == Funciona como o contrário do max ( Mesma sintaxe )
				System.out.println("\nO maior valor da lista é: "+ Collections.min(notas));
			// .clear == Limpa todos os valores armazenados da lista
				notas.clear();
				System.out.println("\nA lista está vazia: "+ notas.toString());

	}

}
