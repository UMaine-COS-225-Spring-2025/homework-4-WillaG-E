public class LibraryTester{
    public static void main(String[] args){
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');
    
        System.out.println(shelfO);
        System.out.println(shelfT);

        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");
    
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}