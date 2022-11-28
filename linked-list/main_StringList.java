package testLinkedList;

import java.util.Comparator;

public class main_StringList {

		public static <T> void main(String args[]) {
			
			//Ascendente
			Comparator<String> asc = new ComparadorAsc();
			//Descendente
			Comparator<String> desc = new ComparadorDesc();
			
			
			
			
			//Creo lista de enteros
			Lista<String> stringList = new Lista(asc);
			stringList.add("Facil");
			stringList.add("Es");
			stringList.add("Parcial");
			stringList.add("Prog2");
			
			System.out.println("--------- Lista String inicial -----------");
			
			for(String i:stringList) {
				System.out.println(i);
			}
			
			
			System.out.println("--------- Lista String busqueda elementos -----------");
			
			System.out.print("La palabra 'Parcial'");
			System.out.println(returnMess(stringList.getPosition("Parcial")));
			System.out.print("La palabra 'Recuperatorio' ");
			System.out.println(returnMess(stringList.getPosition("Recuperatorio")));
			stringList.setOrder(desc);
			
			
			System.out.println("--------- Lista String Descendente -----------");
			
//			stringList.add("Zidane");
//			stringList.add("Xavi Hernandez");
//			stringList.add("Aguerrro");
			//stringList.setOrder(asc);
			for(String i:stringList) {
				System.out.println(i);
			}
			
	}
		
	public static String returnMess(int dd) {
		String msjErr = "no se encontro en la lista\n";
		if(dd < 0) {
			return msjErr;
		}
		
		return " se encuentra en la posicion: "+dd+"\n";
	}

}
