/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ngoct
 */
public class Book {
    private final int bookID;
    private final int authorID;
    public String title;
    public double price;
    

    public Book(int bookID, String title, double price, int authorID) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.authorID = authorID;
    }

    public int getBookID() {
        return bookID;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAuthorID() {
        return authorID;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID 
                + ", title=" + title 
                + ", price=" + price 
                + ", authorID=" + authorID + '}';
    }
    
    
    
}
