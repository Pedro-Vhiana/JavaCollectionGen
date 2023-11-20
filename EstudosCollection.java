package Collections;

import java.util.ArrayList;

public class EstudosCollection {

	public static void main(String[] args) {
		
		// Coleções oferecem fomras diferentes de armazenar os dados com base me fatores como:
		// Eficiência no acesso, na busca ou na inserção;
		// Forma de organização dos dados;
		// Forma de acesso, busca e inserção dos dados;
		
		
		// Agora o tipo primitivo fica mais bombado para acriação de uma coleção, assim se utilizando o nome completo com a letra maíuscula inicial.
		Double y = Double.valueOf(9);
		
		// Cria a Collection ArrayList notas
		ArrayList<Double> notas = new ArrayList<Double>();
		
		// Adiciona as Notas. Observe que a primeira nota é o  Objeto Wrapper Double
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);

	}

}
