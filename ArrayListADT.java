package generics;

public interface ArrayListADT<T> {
	
	//pure module which adds an element to the ArrayList
	public void add (T element);
	
	//function to remove the last element in the ArrayList and return its memory address
	public T remove();
	
	//boolean function to indicate if the ArrayList is empty or not
	 public boolean isEmpty();

	 //return the number of elements in the ArrayList
	 public int size();
	 
	 //toString to create a "sentence" containing the contents of all objects in the ArrayList
	 public String toString();
	 
	 // function to get and return the position of an object in a index.
	 public T get(int index);

}
