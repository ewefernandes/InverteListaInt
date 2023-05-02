package controller;
import br.edu.fateczl.lista.listaint.*;

public class InverteLista {

	public void inversao(Lista li) throws Exception {
		int tamanho = li.size();
		
		for (int i = 2; i <= tamanho; i ++) {
			
			li.addLast(li.get(tamanho-i));
			li.remove(tamanho - i);
		}
		
		System.out.println(li.toString());
	}
}
