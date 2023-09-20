package application;

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book()
	{
		this.title = "";
		this.author = "";
		this.year = 0;
	}
	
	public Book(String title, String author, int year)
	{
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String toString() 
	{
		return "\nTitle: " + this.title + " Author: " + this.author + " Year: " + this.year;
	}
	
	public boolean equals (Object o)
	{
		Book b = (Book) o;
		if (this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
