package nodo.proyecto1.interfaces;

import java.util.Date;
import java.util.List;

import nodo.proyecto1.models.Book;

public interface BaseBookService {

    List<Book> GetAllBooks();

    List<Book> GetById(Integer Id);

    List<Book> GetByName(String Name);

    List<Book> GetByISBN10(String ISBN10);

    List<Book> GetByISBN13(String ISBN13);

    List<Book> GetByEdition(String Edition);

    List<Book> GetByGenre(String Genre);

    List<Book> GetByPublished(Date StartDate, Date EndDate);

    Book saveAndFlush(Book book);

    Book updateBook(Integer Id, Book book);

    Book deleteBook(Integer Id);

}
