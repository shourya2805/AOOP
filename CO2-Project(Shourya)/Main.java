// Controller: Main.java
public class Main {
    public static void main(String[] args) {
        // Create an inventory instance
        Inventory inventory = new Inventory();

        // Add some books to the inventory
        inventory.addBook(new Book("123", "Java Programming", "John Doe", 5));
        inventory.addBook(new Book("456", "Data Structures", "Jane Smith", 10));

        // Display current inventory
        System.out.println("Current Inventory:");
        inventory.displayInventory();

        // Example of looking up a book by ISBN
        System.out.println("\nLooking up ISBN '123':");
        System.out.println(inventory.getBookByIsbn("123"));

        // Define a functional interface for updating book quantities (restocking)
        BookAction restockAction = (book) -> book.setQuantity(book.getQuantity() + 5);

        // Apply restocking to a specific book
        System.out.println("\nRestocking book with ISBN '123':");
        Book book = inventory.getBookByIsbn("123");
        if (book != null) {
            restockAction.apply(book);
        }

        // Display inventory after restocking
        System.out.println("\nInventory After Restocking:");
        inventory.displayInventory();

        // Bulk restocking all books using lambda expression
        System.out.println("\nBulk Restocking All Books by 5:");
        inventory.restockAllBooks(5);
        inventory.displayInventory();

        // Remove a book from the inventory
        System.out.println("\nRemoving book with ISBN '456':");
        inventory.removeBookByIsbn("456");
        inventory.displayInventory();
    }
}
