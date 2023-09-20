package application;
import java.util.Scanner;
import generics.ArrayList;

public class BookShelfArrayList {
	ArrayList<Book>List;
	final int SIZE = 3;
	
	
	public BookShelfArrayList()
	{
		List = new ArrayList<Book>(2);
		
		for (int index = 0; index < SIZE; index++)
		{
			addABook();
		}
		
		System.out.print("");
		System.out.print("The books are: ");
		displayBooks();
		
	removeAnyBook();
	//	System.out.println("After removal, the books are: ");
	//11
	  displayBooks();
	}
	
	public void addABook()
	{
		Scanner scan = new Scanner(System.in);
		Book aBook = null;
		String title, author;
		int year;
		
		System.out.println("Enter the book title: ");
		title = scan.nextLine();
		System.out.println("Enter the author of the book: ");
		author = scan.nextLine();
		System.out.println("Enter the year the book was published in: ");
		year = scan.nextInt();
		scan.nextLine();
		
		aBook = new Book(title, author, year);
		List.add(aBook);
	}
	
	public void displayBooks()
	{
		//System.out.println(List.toString());
		
		//Book b;
		for(int index = 0; index < List.size(); index++)
		{
			if (List.get(index) != null)
			System.out.println(List.get(index));
		}
	}
	
	public void removeBook()
	{
		Book b = null;
		
		b = List.remove();
		System.out.println("The book " + b.getTitle() + " has been removed");
	}
	
	public void removeSpecficBook()
	{
		Book b = null;
		int index;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the index of the element thet you want to delete: ");
		index = scan.nextInt();
		
		b = List.remove(index);
		
		if(b != null)
		{
			System.out.println("The book " + b.getTitle() + " has been removed");
		}
		else
		{
			System.out.println("No boot at that position: ");
		}
	}
	
	public void removeAnyBook()
	{
		Scanner scan = new Scanner(System.in);
		Book aBook;
		Book deletedBook = null;
		String title, author;
		int year;
		boolean found = false;
		
		System.out.println("Please enter the title of the book that you want to delete: ");
		title = scan.nextLine();
		System.out.println("Please enter the author of the book that you want to delete: ");
		author = scan.nextLine();
		System.out.println("Please enetr the year of the book that you want to delete: ");
		year = scan.nextInt();
		scan.nextLine();
		
		aBook = new Book(title, author, year);
		
		deletedBook = List.remove(aBook);
		
		if(deletedBook == null)
		{
			System.out.println("No such book exists. ");
		}
		else
		{
			System.out.println(deletedBook.getTitle() + " was deleted. ");
		}
		
	}
	
	public void findBook()
	{
		Scanner scan = new Scanner(System.in);
		Book aBook;
		String author, title;
		int year;
		boolean found = false;
		
		System.out.println("PLease enter the title of the book: ");
		title = scan.nextLine();
		System.out.println("Please enter the author of the book: ");
		author = scan.nextLine();
		//year = 0;
		
		aBook = new Book(title, author, 0);
		
	
		for(int index = 0; index < List.size(); index++)
		{
			System.out.println(List.get(index));
			
			if (List.get(index).equals(aBook))
			{
				found = true;
			}
		}
		if (found = true)
		{
			System.out.println("The book was found. ");
		}
		else
		{
			System.out.println("The book was not found. ");
			
		}
		
		
	}
	
	public static void main (String [] args)
	{
		new BookShelfArrayList();
	}

}
