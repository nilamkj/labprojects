package arraylab.dao;

import java.util.Arrays;

import com.arraylab.model.Books;

public class BookDAO
{
	static  Books bookArray[]=new Books[3];
	static int index=0;
	
	public void addBook(Books book)
	{
		bookArray[index++]=book;
	}
	public  boolean modifyBookName(int bookId,String bookName)
	{
		
		for(int i=0;i<index;i++)
		{
			if(bookArray[i].getBookId()==bookId)
			{
				bookArray[i].setBookName(bookName);
				return true;
			}
		}
		return false;
	}
	
	public  boolean modifyBookPrice(int bookId,float bookPrice)
	{
		for(int i=0;i<index;i++)
		{
			if(bookArray[i].getBookId()==bookId)
			{
				bookArray[i].setBookPrice(bookPrice);
				return true;
			}
		}
		return false;
	}
public  Books[] getAllBooks()
{
	return bookArray;
}
	

	public static void main(String arg[])
	{
		BookDAO b1=new BookDAO();
		b1.addBook(new Books(11,"Harry Potter",500));
		b1.addBook(new Books(12,"Alkemites",200));
		b1.addBook(new Books(13,"Agnipankh",600));
		
		System.out.println(Arrays.toString(bookArray));
		b1.modifyBookName(101, "java");
		System.out.println(Arrays.toString(bookArray));
		b1.modifyBookPrice(11,200);
		
		
		System.out.println(Arrays.toString(b1.getAllBooks()));
	}
}