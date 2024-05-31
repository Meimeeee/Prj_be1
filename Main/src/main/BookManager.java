/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;

public class BookManager {
    private List<Book> books; 
    private List<Author> authors;
    
    public BookManager() {
    }

    public BookManager(List<Book> books, List<Author> authors) {
        this.books = books;
        this.authors = authors;
    }
    
    void showBookList(){
        System.out.println(books);
    }
    
    
}
