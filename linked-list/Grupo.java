package testLinkedList;

import java.util.*;

public class Grupo extends ElementoCompuesto {

	private List<ElementoCompuesto> elements; 
	
	public Grupo(String no) {
		super(no);
		elements = new ArrayList<>();
	}
	
	public void addElemento(ElementoCompuesto ee) {
		elements.add(ee);
	}
	
	
	@Override
	public int getCountStudents() {
		// TODO Auto-generated method stub
		int rs = 0;
		for(ElementoCompuesto e:elements) {
			rs += e.getCountStudents();
		}
		return rs;
	}
	
	public String toString() {
		String rs = "{ Nombre grupo: "+getName() +"\n";
		for(ElementoCompuesto e:elements) {
			rs +=  e.toString() + "\n";
		}
		
		//rs += " } Nro alumnos: " + getCountStudents();
				
		return rs;
	}

}
