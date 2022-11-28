package testLinkedList;

public class Nodo<T> {
   private T data;
   private Nodo<T> next;
	 
	   
   public Nodo(T data){
        this.data = data;
        this.next = null;
    }
    
   public T getData() {
    	return data;
    }
    
   public void setData(T d) {
    	 data = d;
    }
    
   public Nodo<T> getNext() {
    	return next;
    }
    
   public void setNext(Nodo<T> no) {
    	next = no;
    }
    
    
	    
	 
}
