package testLinkedList;

import java.util.Comparator;

class ComparadorDesc<T extends Comparable<T>> implements Comparator<T> {
	
	
	
	public int compare(T a, T b) {
	    return a.compareTo(b) * -1;
	}
	
}