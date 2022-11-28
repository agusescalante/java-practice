package testLinkedList;

import java.util.*;

public class Lista<T> implements Iterable<T>{
	
    private Comparator<T> order;
    private Nodo<T> head, tail;
    private int length = 0;
    private String errPosition;
 
    public Lista(Comparator<T> o) {
    	// El primer elemento y el ultimos se crean en null
    	head = tail = null;
    	order = o;
    	errPosition = "Este elemento no se encuntra en la lista";
	}
    
    public void setErrorPosition(String ss) {
    	if(ss != null)  errPosition = ss;
    }
    
    
    public void setOrder(Comparator<T> desc) {
    	if(desc != null && !order.equals(desc)) {
    		order = desc;
    		sort();
    	}
    }
    
    
    private void sort() {
    	 Nodo<T> current = head, index = null;
         T temp;
         while (current != null) {
             index = current.getNext();
  
             while (index != null) {
                 if (order.compare(current.getData(), index.getData()) > 0) {
                     temp = current.getData();
                     current.setData(index.getData());
                     index.setData(temp);
                 }
                 index = index.getNext();
  
             }
             // actualizo actual
         current = current.getNext();
         }
    }
   
    public void add(T data){
    	Nodo<T> nuevo = new Nodo<>(data);
    	Nodo<T> curr = head, prev = null;
        if (this.head == null) {
            head = nuevo;
            tail = nuevo;
        } else if (order.compare(nuevo.getData(), curr.getData()) <= 0) {
        	// En el caso que el nuevo elemento sea mas chico que la raiz, es la nueva raiz
        		nuevo.setNext(head);
                head = nuevo;
        } else if (order.compare(nuevo.getData(), tail.getData()) >= 0) {
        // El ultimo elemento es el nuevo
            tail.setNext(nuevo);
            tail = nuevo;
        } else {
        	// Ver si es necesario preguntar 
	        while (order.compare(nuevo.getData(), curr.getData()) > 0) {
	            prev = curr;
	            curr = curr.getNext();
	        }
            prev.setNext(nuevo);
            nuevo.setNext(curr);
        }
        
	    length++;
    }
    
    public void add(int position, T data){
        if (position == 1) {
        	Nodo<T> temp = head;
            head = new Nodo<T>(data);
            head.setNext(temp);
            
        }
 
        Nodo<T> temp = head;
        Nodo<T> prev = new Nodo<T>(null);
        // Actualizo temp y prev, actual y previo
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.getNext();
            position--;
        }
        
        //(Nodo x1) -> (Nodo x2)
        // (Nodo x1) -> (Nuevo Nodo) -> (Nodo x2)
        length++;
        prev.setNext(new Nodo<T>(data));
        prev.getNext().setNext(temp);
    }
    
    
    public int getPosition(T data) {
    	boolean exists = false;
    	int count = 0;
    	Nodo<T> current = head;
	    	while(!exists && current.getNext() != null) {
	    		if(current.getData().equals(data)) {
	    			exists = true;
	    		}
	    		current = current.getNext();	
	    		count++;
    	}
	
		return (exists) ? count : -1;	
    	
    }
    
    private void deleteFirst() {
    	head = head.getNext();
		head.setNext(head.getNext());
		
    }
    
    public void remove(int pos) {
    	if(pos == 1) {
    		deleteFirst();
    	} else {
	    	int count = 1;
	    	Nodo<T> current = head;
	    	Nodo<T> prev = new Nodo<T>(null);
	    	
	    	while(count < pos) {
	    		count++;
	    		prev = current;
	    		current = current.getNext();
	    	}
	    	prev.setNext(current.getNext());
	    	this.length--; 	
    	}
    }
    
    
    public boolean contains(T data) {
    	Nodo<T> curren = head;
    	while(iterator().hasNext()) {
    		if(curren.getData().equals(data)) {
    			return true;
    		}
    		curren = curren.getNext();
    	}
    	return false;
    }
    // Elimina todos los elementos que sean igual al parametro
    public void removeElements(T element){
    	
        while (head != null && head.getData().equals(element)) {
            head = head.getNext();
        }
        Nodo<T> curr = head, prev = new Nodo<T>(null);
        while (curr != null) {
            if (curr.getData().equals(element))
                prev.setNext(curr.getNext());
            else
                prev = curr;
            	curr = curr.getNext();
    	}
        
    }
 
   //Vacia lista, el nodo inicial apunta a null
    public void clear(){
        head = null;
        length = 0;
    }
 
   
    public boolean empty(){
    	return (head == null) ? true : false;
    }
    
    public int length() { 
    	return length; 
    }
 

    public String toString(){
        String S = "{ ";
 
        Nodo<T> X = head;
 
        if (X == null)
            return S + " }";
 
        while (X.getNext() != null) {
            S += String.valueOf(X.getData()) + " \n";
            X = X.getNext();
        }
 
        S += String.valueOf(X.getData());
        return S + " }";
    }

    //Metodo para por iterar con for each la lista
	public Iterator<T> iterator() {
		 return new Iterator<T>() {
	            Nodo<T> current = head;
	            
	            @Override
	            public boolean hasNext() {
	                return current != null;
	            }

	            @Override
	            public T next() {
	                if (hasNext()) {
	                    T data = current.getData();
	                    current = current.getNext();
	                    return data;
	                }
	                return null;
	            }

	        };

	}
}


