package testLinkedList;

import java.util.Comparator;

public abstract class CompGeneral implements Comparator<Alumno> {

	private Comparator<Alumno> next;
	
	public CompGeneral() {
		next = null;
	}
	
	public CompGeneral(Comparator<Alumno> sigui) {
		next = sigui;
	}
	
	
	public abstract int comparar(Alumno p1, Alumno p2);

	
	public int compare(Alumno p1, Alumno p2) {
		int result = this.comparar(p1, p2);
		
		if(result == 0) {
			if( next != null ) {
				return next.compare(p1, p2);				
			} else {
				return 0;
			}
		}
		return result;
	}
}
