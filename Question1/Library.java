package Question1;

class Library {
    private Book[] books;
    private int capacity;
    private int numberOfBooks;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.numberOfBooks = 0;
    }

    public void addBook(Book newBook) {
        if (numberOfBooks < capacity) {
            books[numberOfBooks] = newBook;
            numberOfBooks++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Cannot add book. Library is full.");
        }
    }

    public void removeBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < numberOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
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

    public void searchBook(int bookID) {
        boolean found = false;
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