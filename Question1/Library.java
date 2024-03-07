package Question1;

class Library {
    // Array of Oject of class Book
    private Book[] books;
    // To determine the capacity of Library
    private int capacity;
    //intial capacity of books
    private int numberOfBooks;

    // constructor of library class
    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.numberOfBooks = 0;
    }
   // addBook Method
    public void addBook(Book newBook) {
        //Intial capacity of number of books = 0, will always less than the capacity of library
        if (numberOfBooks < capacity) {
        // new book will add the index
            books[numberOfBooks] = newBook;
        // Intital number of book increased
            numberOfBooks++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Cannot add book. Library is full.");
        }
    }
    // Remove Book
    public void removeBook(int bookID) {
        boolean found = false;
        // loop to ilirate through Book array
        for (int i = 0; i < numberOfBooks; i++) {
        // After removing book adjusting Array index of Book Object because array of imutable
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < numberOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
        // Number of books will decrease after removing
                numberOfBooks--;
                found = true;
                System.out.println("Book with ID " + bookID + " removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }
    // Method to Search BOok
    public void searchBook(int bookID) {
        boolean found = false;
    // Searching book through their IDs by getBookId method
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println(books[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }
}