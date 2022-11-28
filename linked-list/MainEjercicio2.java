package testLinkedList;

import java.util.Comparator;

public class MainEjercicio2 {

	
	public static void main(String[] args) {
		
		CompGeneral dni = new CompAlumnoDNI();
		CompGeneral nom = new CompAlumnoApellido(dni);
		CompGeneral ape = new CompAlumnoApellido(nom);
		
		
		Alumno a1 = new Alumno("A1","A2",12);
		Alumno a2 = new Alumno("A1","A1",11);
		Alumno a3 = new Alumno("A1","A2",13);
		Alumno a4 = new Alumno("A1","A2",11);
		
		Lista<Alumno> studentList = new Lista(ape);
		studentList.add(a1);
		studentList.add(a2);
		studentList.add(a3);
		studentList.add(a4);
		System.out.println("Lista de alumnos");
		for(Alumno a:studentList) {
			System.out.println(a);
		}

	}

}
