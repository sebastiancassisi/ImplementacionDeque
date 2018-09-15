package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {

	//Mezcla entre stack y Queue
	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<>();
		
		dq.add("1-Sebastian");
		dq.add("2-Juan");
		dq.add("3-Carlos");
		dq.add("6-Flavia");

		
		//Muestro quien esta al tope
		String x = dq.peek();
		System.out.println("Peek "+x);
		
		//Elimina el elemento
		x = dq.poll();
		System.out.println("Poll "+x);
		
		//Traigo el primer elemento
		String y = dq.getFirst();
		System.out.println("getFirst() "+y);
		
		//Traigo el ultimo elemento
		 y = dq.getLast();
		System.out.println("getLast() "+y);
	
		
		dq.addFirst("4-Pedro");
		dq.addLast("5-Ramon");
		
		
		for (String string : dq) {
			System.out.println(string);
		}
		
	}

}
