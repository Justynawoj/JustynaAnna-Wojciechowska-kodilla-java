package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> booksLibraryA= new HashSet<>();

        Book bookA1 = new Book("John Widman","2000", 2000,"sdsfdf");
        Book bookA2 = new Book("Sara Freeman","2010",2010,"fgdftr");
        Book bookA3 = new Book("Clark Newman","2000",2000,"dfsdfsdf");

        booksLibraryA.add(bookA1);
        booksLibraryA.add(bookA2);
        booksLibraryA.add(bookA3);

        //When
        int yearMedian = adapter.publicationYearMedian(booksLibraryA);

        //Then
        assertEquals(2000,yearMedian);
    }
}
