package testLinkedList;

import java.util.Comparator;

public class main_IntegerList {

	public static <T> void main(String args[]) {
		
		//Ascendente
		Comparator<Integer> asc = new ComparadorAsc();
		//Creo lista de enteros
		Lista<Integer> integerList = new Lista(asc);
		integerList.add(10);
		integerList.add(21);
		integerList.add(1);
		integerList.add(5);
		integerList.add(11);
		
		System.out.println("--------- Lista Integer inicial -----------");
		
		for(Integer i:integerList) {
			System.out.println(i);
		}
		
		integerList.remove(1);
		integerList.removeElements(5);
		integerList.removeElements(11);
		
		
		System.out.println("--------- Lista Integer modificada -----------");
		
		for(Integer i:integerList) {
			System.out.println(i);
		}
		
		
		
	}
}
