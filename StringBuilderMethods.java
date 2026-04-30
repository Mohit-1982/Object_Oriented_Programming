//package OOPS_Practice.Level2.Day3;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Book {
//    private final int BOOK_ID;
//    private String bookTitle;
//    private final String author;
//    private boolean isIssued;
//
//    Book(int BOOK_ID, String bookTitle, String author, boolean isIssued) {
//        this.BOOK_ID = BOOK_ID;
//        this.bookTitle = bookTitle;
//        this.author = author;
//        this.isIssued = isIssued;
//    }
//
//    public int getBOOK_ID() {
//        return this.BOOK_ID;
//    }
//    public String getBookTitle() {
//        return this.bookTitle;
//    }
//    public String getAuthor() {
//        return this.author;
//    }
//    public boolean getIssuedOrNot() {
//        return this.isIssued;
//    }
//
//    public void issue() {
//        if (!isIssued) this.isIssued = true;
//    }
//    public void returnBook() {
//        if (!isIssued) {
//            System.out.println("Book is not issued");
//            return;
//        }
//        this.isIssued = false;
//    }
//    @Override
//    public String toString() {
//        return (getAuthor() + " " + getBOOK_ID() + " " + getBookTitle() + " " + getIssuedOrNot());
//    }
//}
//
//class User {
//    private int userId;
//    private String name;
//
//    User(int userId, String name) {
//        this.userId = userId;
//        this.name = name;
//    }
//
//    public int getUserId() {
//        return this.userId;
//    }
//    public String getName() {
//        return this.name;
//    }
//
//    @Override
//    public String toString() {
//        return (getUserId() + " " + getName());
//    }
//}
//
//class Library {
//    List<Book> book = new ArrayList<>();
//    List<User> user = new ArrayList<>();
//
//    public void addBook(Book b) {
//        book.add(b);
//    }
//    public void addUser(User u) {
//        user.add(u);
//    }
//    public boolean issueBook(int bookId, int userId) {
//        Book b = null;
//        User u = null;
//
//        for (Book bk : book) {
//            if (bk.getBOOK_ID() == bookId) {
//                b = bk;
//                break;
//            }
//        }
//
//        for (User ur : user) {
//            if (ur.getUserId() == userId) {
//                u = ur;
//                break;
//            }
//        }
//
//        if (b == null) {
//            System.out.println("Book doesn't exists");
//            return false;
//        }
//        if (u == null) {
//            System.out.println("User Doesn't exist");
//            return false;
//        }
//
//        b.issue();
//        //resolve --> who is going to issue the book create a method or something who can store who is issuing the book
//    }
//}
//public class Lib {
//    public static void main(String[] args) {
//
//    }
//}
