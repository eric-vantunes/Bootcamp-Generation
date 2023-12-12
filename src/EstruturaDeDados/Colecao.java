package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecao {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(5);
		minhaLista.add(8);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento é: " + primeiroElemento);
		
		for(int i=0; i < minhaLista.size(); i++) {
			System.out.println("\nelemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		
		System.out.println("\nDepois de ordenado... ");
		System.out.println(minhaLista);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(0);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
	}

}
