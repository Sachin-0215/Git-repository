package project;

class Library{
	public String[] books;
	int no_of_books;
	Library(){
		this.books = new String[5];
		this.no_of_books = 0;
	}
	public void addBook(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(books+ " Has been added");
	}
	public void showAvailable() {
		System.out.println("Available Books are ---");
		for(String book:this.books)
			{
				if(book==null)
					{break;}
				System.out.println("* "+book);
			}
	}
	public void issueBooks(String book)
	{
		
		for(int i=0;i<this.books.length;i++)
		{
			if(this.books[i].equals(book)) {
				System.out.println("This book has been Issued! ");
				this.books[i] = null;
			}
		}
		System.out.println("This book does not exist ");
		
	}
}

public class Online_Libraray {

	public static void main(String[] args) {
		// You have to implement a library using Java Class Library
		// Methods: addbook, issueBook, returnBook, showAvailablebooks
		// Properties: array to store the available books,
		// Array to store the issues books
		
		Library CL = new Library();
		CL.addBook("Rich Dad and Poor Dad");
		CL.addBook("Power of Subconscious Mind");
		CL.addBook("Python by Yashwant Kanekar");
		CL.addBook("Operating System By Galvin");
		CL.showAvailable();
		CL.issueBooks("C++");

	}

}
