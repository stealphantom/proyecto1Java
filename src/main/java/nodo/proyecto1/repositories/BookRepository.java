package nodo.proyecto1.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import nodo.proyecto1.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    // Metodo para traer todos los libros
    @Query(nativeQuery = true, value = "SELECT * FROM book")
    List<Book> GetAllBooks();

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE Id = Id")
    List<Book> GetById(Integer Id);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE Name LIKE %:Name%")
    List<Book> GetByName(String Name);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE ISBN10 LIKE %:ISBN10%")
    List<Book> GetByISBN10(String ISBN10);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE ISBN13 LIKE %:ISBN13")
    List<Book> GetByISBN13(String ISBN13);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE Published BETWEEN :startDate AND :endDate")
    List<Book> GetByPublished(Date startDate, Date endDate);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE Edition LIKE %:Edition")
    List<Book> GetByEdition(String Edition);

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE Genre LIKE %:Genre")
    List<Book> GetByGenre(String Genre);

    Book saveAndFlush(Book book);
}
