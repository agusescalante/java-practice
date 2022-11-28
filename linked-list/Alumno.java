package testLinkedList;

import java.util.*;

public class Alumno extends ElementoCompuesto {
	private String lastName;
	private int dni;
	private List<String> interes;
	
	public Alumno(String nombre, String lastName, int dni) {
		super(nombre);
		this.lastName = lastName;
		this.dni = dni;
		this.interes = new ArrayList<>();
	}
	
	public void addInteres(String in) {
		if(!interes.contains(in) && in != null) interes.add(in);
	}
	
	public List<String> getInteres(){
		return new ArrayList<>(interes);
	}

	public int getCountStudents() {
		return 1;
	}

	
	public String getLastName() {
		return lastName;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "              Alumno: apellido = " + lastName + ", nombre = "+ getName() + ", DNI = " + dni+"  " ;
	}
	
	public boolean equals(Object o) {
		Alumno aux = (Alumno) o;
		return getName().equals(aux.getName()) && getLastName().equals(aux.getLastName())
				&& getDni() == aux.getDni();
	}

	

	

}
