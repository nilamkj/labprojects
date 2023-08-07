package arraylab.service;

import com.arraylab.model.Books;

import arraylab.dao.BookDAO;

public class BooksService {
	static BookDAO bookDAO=new BookDAO();
	
	public void addBookService(Books book)
	{
		bookDAO.addBook(book);
	}
	public boolean modifyBookNameService(int bookId,String bookName)
	{
		return bookDAO.modifyBookName(bookId,bookName);
	}
	public boolean modifyBookPriceService(int bookId,float bookPrice)
	{
		return bookDAO.modifyBookPrice(bookId, bookPrice);
	}
	public Books[] getAllBooks()
	{
		return bookDAO.getAllBooks();
	}
}
