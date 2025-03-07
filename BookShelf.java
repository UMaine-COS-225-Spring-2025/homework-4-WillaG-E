import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf(char firstLetter){
        this.firstLetter = firstLetter;
        this.books = new ArrayList<>(8);
    }

    public char getFirstLetter(){
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public void addBook(Book book){
        if(books.size() < 8 && book.toString().charAt(0) == firstLetter){
            books.add(book);
        }
    }

    public void removeBook(Book book){
        books.remove(book);
    }
}
