import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void checkStockNotFull(Book book) {
        if (this.capacity > this.collection.size()) {
            this.collection.add(book);
        }
    }
}
