package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
