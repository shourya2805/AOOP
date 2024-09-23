// Service: Inventory.java
import java.util.*;

public class Inventory {
    private List<Book> inventoryList = new ArrayList<>();
    private Map<String, Book> isbnLookupMap = new HashMap<>();

    // Add a book to the inventory
    public void addBook(Book book) {
        inventoryList.add(book);
        isbnLookupMap.put(book.getIsbn(), book);
    }

    // Get all books in inventory
    public List<Book> getAllBooks() {
        return new ArrayList<>(inventoryList);
    }

    // Lookup a book by ISBN
    public Book getBookByIsbn(String isbn) {
        return isbnLookupMap.get(isbn);
    }

    // Remove a book by ISBN
    public void removeBookByIsbn(String isbn) {
        Book book = isbnLookupMap.remove(isbn);
        if (book != null) {
            inventoryList.remove(book);
        }
    }

    // Restock all books using a lambda expression
    public void restockAllBooks(int additionalQuantity) {
        inventoryList.forEach(book -> book.setQuantity(book.getQuantity() + additionalQuantity));
    }

    // Display all books
    public void displayInventory() {
        inventoryList.forEach(System.out::println);
    }
}
