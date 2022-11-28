package testLinkedList;

import java.util.Comparator;

public class CompAlumnoDNI extends CompGeneral {

	public CompAlumnoDNI() {
		// TODO Auto-generated constructor stub
	}

	public CompAlumnoDNI(Comparator<Alumno> sigui) {
		super(sigui);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(Alumno p1, Alumno p2) {
		// TODO Auto-generated method stub
		return p1.getDni() - p2.getDni();
	}

}
