package view;
import br.edu.fateczl.lista.listaint.*;
import controller.InverteLista;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		InverteLista l = new InverteLista();
		
		lista.addFirst(3);
		lista.add(5, 1);
		lista.add(18, 2);
		lista.add(12, 3);
		lista.add(9, 4);
		lista.add(7, 5);
		lista.add(6, 6);
		lista.add(2, 7);
		lista.add(13, 8);
		lista.add(4, 9);
		lista.addLast(16);
		
		System.out.println(lista.toString());
		l.inversao(lista);
	}

}
