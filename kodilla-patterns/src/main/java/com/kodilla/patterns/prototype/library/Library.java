package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();



    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }


    public Library deepCopy() throws CloneNotSupportedException {

        Library newLibrary = shallowCopy();
        newLibrary.books = new HashSet<>();

        for(Book theOriginalBook: books){
            Book clonedBook = new Book(theOriginalBook.getTitle(),theOriginalBook.getAuthor(),theOriginalBook.getPublicationDate());
            newLibrary.getBooks().add(clonedBook);
        }

        return newLibrary;
    }
}