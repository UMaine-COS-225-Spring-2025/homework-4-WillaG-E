import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf(char firstLetter){
        this.firstLetter = firstLetter;
        this.books = new ArrayList<>(8);
    }
}
