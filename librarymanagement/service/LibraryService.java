package service;

import dao.BookDAO;
import dao.BookDAOImpl;
import dto.BookDTO;

import java.util.List;

public class LibraryService {

    private BookDAO dao = new BookDAOImpl();

    public void addBook(String title, String author) {
        dao.addBook(new BookDTO(title, author));
    }

    public void deleteBook(int id) {
        dao.deleteBook(id);
    }

    public void showAllBooks() {
        List<BookDTO> list = dao.getAllBooks();

        if (list.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (BookDTO b : list) {
                System.out.println(
                        b.getId() + " | " +
                        b.getTitle() + " | " +
                        b.getAuthor()
                );
            }
        }
    }
}
