package arraylab.view;

import java.util.Scanner;

import com.arraylab.model.Books;

import arraylab.dao.BookDAO;
import arraylab.service.BooksService;

public class BookView {
//	public String toString()
//	{
//		return BookView("Book Id="+bookId+"  Book Name="+bookName+"  Book Price="+bookPrice+"\n");
//	}
	//static BooksService bookService=new BooksService();
	public static void main(String[] args) {
		 BooksService booksService=new BooksService();
		 
		Scanner sc=new Scanner(System.in);
	int choice;
	do
	{
		System.out.println("Choose\n1.Add a new book \n2.Modify the book name \n3.Modify the book price  ");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Enter Book Id:");
		        int id=sc.nextInt();
		        System.out.println("Enter Book Name:");
		        String name=sc.next();
		        System.out.println("Enter Book Price:");
		        float price=sc.nextFloat();
		        
		        booksService.addBookService(new Books(id,name,price));
		        break;
		        
		case 2:System.out.println("Enter Book Id:");
				int id1=sc.nextInt();
				System.out.println("Enter Book Name:");
				String name1=sc.next();
//				System.out.println("Enter Book Price:");
//				float price1=sc.nextFloat();
				
				booksService.modifyBookNameService(id1, name1);
				break;
				
		case 3:System.out.println("Enter Book Id:");
				int id2=sc.nextInt();
//				System.out.println("Enter Book Name:");
//				String name2=sc.next();
				System.out.println("Enter Book Price:");
				float price2=sc.nextFloat();
				
				booksService.modifyBookPriceService(id2,price2);
				break;
				
		
		}	
								
	}while(choice=='Y'||choice=='y');
	
	}

	}


