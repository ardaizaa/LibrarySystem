/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem.controller;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sim
 */
public class Author {
    private long authorId;
    private String name;
    private List<Book> books;

    public Author(String name, Book book) {
        authorId = System.currentTimeMillis();
        this.name = name;
        books = new ArrayList<Book>();
        books.add(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public List<Long> getBooks() {
        return books;
    }
    //NOTE: How about adding support for removing book in books.
}
