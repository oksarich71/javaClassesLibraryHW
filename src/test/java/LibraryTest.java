import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book ("Gone with the wind", "Mitchell", "drama");
        library = new Library(1000);
        library.addBook(book);
    }

    @Test
    public void canCountBooks() {
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canCheckStockFull() {
        library.checkStockNotFull(book);
        assertEquals(2, library.countBooks());
    }
}
