package Question1;

public class Book {
   // Data Memebers of Book Class
   private int bookID;
   private String bookTitle;
   private String bookAuthor;
   private Boolean isAvailable;
   
   // Constructor
   public Book(int bookID, String bookTitle, Boolean isAvailable, String bookAuthor) {
      super();
      this.bookID = bookID;
      this.bookTitle = bookTitle;
      this.bookAuthor = bookAuthor;
      this.isAvailable = isAvailable;
   }
  // getter setter
   public int getBookID() {
      return bookID;
   }

   public void setBookID(int bookID) {
      this.bookID = bookID;
   }

   public String getBookTitle() {
      return bookTitle;
   }

   public void setBookTitle(String bookTitle) {
      this.bookTitle = bookTitle;
   }

   public String getBookAuthor() {
      return bookAuthor;
   }

   public void setBookAuthor(String bookAuthor) {
      this.bookAuthor = bookAuthor;
   }

   public Boolean getIsAvailable() {
      return isAvailable;
   }

   public void setIsAvailable(Boolean isAvailable) {
      this.isAvailable = isAvailable;
   }

   // toString Method
   @Override
   public String toString() {
      return "Book [bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", isAvailable="
            + isAvailable + "]";
   }
}