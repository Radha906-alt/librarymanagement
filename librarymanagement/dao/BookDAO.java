package dao;

import dto.BookDTO;
import java.util.List;

public interface BookDAO {

    void addBook(BookDTO book);

    void deleteBook(int id);

    List<BookDTO> getAllBooks();
}
