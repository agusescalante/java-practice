package testLinkedList;

import java.util.*;

public class CompAlumnoNombre extends CompGeneral{

	public CompAlumnoNombre() {
		super();
	}
	
	public CompAlumnoNombre(CompGeneral a) {
		super(a);
	}

	@Override
	public int comparar(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
