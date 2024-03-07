package Question1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
    // Object of class Book
        Book newBook;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the library: ");
        int capacity = scanner.nextInt();
        Library library = new Library(capacity);

        System.out.print("Enter the number of books to add initially: ");
        int initialBooks = scanner.nextInt();

        for (int i = 0; i < initialBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            System.out.print("Book ID: ");
            int bookID = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Book Author: ");
            String bookAuthor = scanner.nextLine();
            System.out.print("Is the book available? (true/false): ");
            boolean isAvailable = scanner.nextBoolean();

            newBook = new Book(bookID, bookTitle, isAvailable, bookAuthor);
            library.addBook(newBook);
        }
// Giving Options to users to choose any method to perform
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter details for the new book:\n");
                    System.out.print("Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Book Author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Is the book available? (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();

                    newBook = new Book(bookID, bookTitle, isAvailable, bookAuthor);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter the ID of the book to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;
                case 3:
                    System.out.print("Enter the ID of the book to search: ");
                    int searchID = scanner.nextInt();
                    library.searchBook(searchID);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}