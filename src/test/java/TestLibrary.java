import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;
    private Book book8;


    @Before
    public void before(){
        library = new Library("Book Van");
        book1 = new Book("Wind in the Willows", "Kenneth Grahame","Children's Literature");
        book2 = new Book("The Power Of Now", "Eckhart Tolle", "Self-Help");
        book3 = new Book("Capital in the 21st Century", "Thomas Piketty", "Economics");
        book4 = new Book("Harry Potter", "JK Rowling", "Magic and stuff");
        book5 = new Book("Communist Manifesto", "Karl Marx", "Left wing Propaganda");
    }

    @Test
    public void checkLibraryHasNoBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantAddMoreThanFour(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(4, library.getBookCount());
        library.addBook(book1);
        assertEquals(4, library.getBookCount());
    }

}
