package testLinkedList;

import java.util.Comparator;

public class CompAlumnoApellido extends CompGeneral{

	public CompAlumnoApellido() {
		super();
	}
	
	public CompAlumnoApellido(Comparator<Alumno> a) {
		super(a);
	}

	@Override
	public int comparar(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p1.getLastName().compareTo(p2.getLastName());
	}

}
