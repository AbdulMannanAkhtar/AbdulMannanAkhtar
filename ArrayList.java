/********************************************************************
  ArrayList.java     

  This is a second version of the ArrayList code. It 
contains a new version of add(element, index) and it also handles capacity
********************************************************************/

package generics;

public class ArrayList<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int open;  // indicates the next open slot
   private int count; //number of items inserted into the array so far
   private T[] array; 
   private int capacity; //maximum number of slots in the array

   //-----------------------------------------------------------------
   //  Creates an empty ArrayList using the default capacity.
   //-----------------------------------------------------------------
   public ArrayList()
   {
      open = 0;
      count = 0;
      array = (T[])(new Object[DEFAULT_CAPACITY]);
      for (int i=0; i<DEFAULT_CAPACITY; i++)
    	  array[i] = null;
      this.capacity = DEFAULT_CAPACITY;
   }

   //-----------------------------------------------------------------
   //  Creates an empty ArrayList using the specified capacity.
   //-----------------------------------------------------------------
   public ArrayList(int initialCapacity)
   {
      this.open = 0;
      this.count = 0;
      array = (T[])(new Object[initialCapacity]);
      for (int i=0; i<initialCapacity; i++)
    	  array[i] = null;
      this.capacity = initialCapacity;
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the next available slot in the array
   //-----------------------------------------------------------------
   public void add (T element)
   {
       if (size() == array.length )
		  expandCapacity();
         array[open] = element;
         this.open++;
         this.count++;
   }
   
  //-----------------------------------------------------------------
   //  Second version of add - adds the specified element to index position index
   //-----------------------------------------------------------------
   public void add (T element, int index)
   {
	    //if (size() == this.capacity)
		  //expandCapacity();

	   if (index > array.length)
		 System.out.println("Sorry this slot doesn't exist");
	   else
		   if (array[index] == null)
	           {
		       array[index] = element;
		       this.count++;
               }
	   else
		   System.out.println("Sorry this slot is taken.");
   }

   //-----------------------------------------------------------------
   //  Removes the last element added to the array. 
   //-----------------------------------------------------------------
   public T remove()
   {
      if (isEmpty())
        System.out.println("The list is empty");

      open--;
      T result = array[open];
      array[open] = null; 
 
      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns true if the array is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
	   
	return (this.count == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements in the array.
   //-----------------------------------------------------------------
   public int size()
   {
	return this.count;
   }

   //-------------------------------------------------
	//  HELPER METHOD - Creates a new array to store the contents of the array with
	//  twice the capacity of the old one.
	//-----------------------------------------------------------------
	private void expandCapacity()
	{
	    T[] larger = (T[])(new Object[array.length*2]);

	      for (int scan=0; scan < array.length; scan++)
	         larger[scan] = array[scan];

	      array = larger;
	   }


   //-----------------------------------------------------------------
   //  Returns a string representation of the entire array. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      for (int scan=0; scan < open; scan++) 
      {
         if (array[scan] != null)
         	result = result + array[scan].toString() + "\n";
      }

      return result;
   }

   public T get(int index)
   {
	   if (index < 0 || index > size())
	   {
		   return null;
	   }
	   else
	   {
		   return array[index];
	   }
   }
   
   public T remove (int index)
   {
	   T result = null;
	   
	   if (index > size() || index < 0)
	   {
		   return null;
	   }
	   
	   if (array[index] == null)
	   {
		   return null;
	   }
	   else
	   {
		   result = array[index];
		   array[index] = null;
	   }
	   return result;
   }
   
   public T remove (T element)
   {
	   T result = null;
	   if(isEmpty())
	   {
		   System.out.println("The list is empty. ");
	   }
	   for(int i=0; i<this.capacity; i++)
	   {
		   if(array[i] != null && array[i].equals(element))
		   {
			   result = array[i];
			   array[i] = null;
			   i--;
		   }
	   }
	   return result;
   }
   
}
   
