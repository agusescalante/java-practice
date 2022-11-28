package testLinkedList;

public abstract class ElementoCompuesto {
	
	private String name;
	
	public ElementoCompuesto(String no) {
		name = no;
	}
		
	public String getName() {
		return name;
	}
	public abstract int getCountStudents();

}
