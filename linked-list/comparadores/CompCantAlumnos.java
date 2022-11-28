package testLinkedList;

import java.util.Comparator;

public class CompCantAlumnos implements Comparator<ElementoCompuesto> {

	// de manera descendente 
	@Override
	public int compare(ElementoCompuesto p1, ElementoCompuesto p2) {
		// TODO Auto-generated method stub
		return p1.getCountStudents() - p2.getCountStudents() * -1;
	}

}
