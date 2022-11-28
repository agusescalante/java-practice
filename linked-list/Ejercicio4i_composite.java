package testLinkedList;

import java.util.Comparator;

public class Ejercicio4i_composite {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<ElementoCompuesto> asc = new CompCantAlumnos();
		Grupo unicen = new Grupo("Unicen");
		Grupo exa = new Grupo("Exactas");
		Grupo his = new Grupo("Historia");
		Grupo hum = new Grupo("Humanas");
		
		Alumno a1 = new Alumno("John","Doe",12);
		Alumno a2 = new Alumno("Mora","Diaz",33);
		Alumno a3 = new Alumno("Roman","Bazan",8);
		Alumno a4 = new Alumno("Martin","Gomez",01);
		Alumno a5 = new Alumno("Flora","Rivas",99);
		Alumno a6 = new Alumno("Juana","Garcia",7);
		Alumno a7 = new Alumno("Federico","Lopez",11);
		
		
		/// Estructura UNICEN
		hum.addElemento(a2);
		
		his.addElemento(a5);
		his.addElemento(a4);
		his.addElemento(a3);
		
		hum.addElemento(his);
		
		
		unicen.addElemento(a1);
		
		exa.addElemento(a6);
		exa.addElemento(a7);
		
		
		unicen.addElemento(exa);
		unicen.addElemento(hum);
		
		
		
		/// Olimpiadas- grupo principal
		Grupo olimpiadas = new Grupo("olimpeadas");
		
		//sub-grupos
		Grupo mat = new Grupo("Matea2");
		Grupo fibo = new Grupo("LosFibo");
		
		//Alumnos
		Alumno a11 = new Alumno("Isaac","Newton",12);
		a11.addInteres("sucesiones");
		Alumno a22 = new Alumno("Jose","Paso",33);
		a22.addInteres("problemas");
		Alumno a33 = new Alumno("Bernardino","Rivas",8);
		a33.addInteres("matemaricas");
		Alumno a44 = new Alumno("Julio","Cesar",01);
		a44.addInteres("sucesiones");
		a44.addInteres("albegra");
		Alumno a55 = new Alumno("Juan","Juarez",99);
		a55.addInteres("sucesiones");
		a55.addInteres("albegra");
		
		//agrego a LosFibos
		fibo.addElemento(a11);
		fibo.addElemento(a22);
		fibo.addElemento(a33);
		
		//agrego a Matea2
		mat.addElemento(a44);
		mat.addElemento(a55);
		
		//agrego a olimpiadas
		olimpiadas.addElemento(mat);
		olimpiadas.addElemento(fibo);
		
		Lista<ElementoCompuesto> elementos = new Lista(asc);
		elementos.add(unicen);
		elementos.add(olimpiadas);
		for(ElementoCompuesto e:elementos) {
			System.out.println(e);
		}
		//System.out.println(unicen.getCountStudents());

		
		
		
		
		
	}

}
