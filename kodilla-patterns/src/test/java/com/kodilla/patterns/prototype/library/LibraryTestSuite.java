package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("novels");

        Book book1 = new Book("Short novel I","J.J",LocalDate.of(2020,5,5));
        Book book2 = new Book("Short novel II","J.J",LocalDate.of(2020,5,15));
        Book book3 = new Book("Short novel III","J.J",LocalDate.of(2020,5,25));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library copiedByShallow = null;

        try {
            copiedByShallow = library.shallowCopy();
            copiedByShallow.setName("Shallow Novels");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library copiedByDeepCopy = null;
        try {
            copiedByDeepCopy = library.deepCopy();
            copiedByDeepCopy.setName("Deep Novels");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // When
      /*  library.books.remove(book3);

        //Then
        System.out.println(library.books + "------ the original library");
        System.out.println(copiedByShallow.getBooks() + "------- library copied by shallowCopy method");
        System.out.println(copiedByDeepCopy.getBooks() + "------  library copied by deepCopy method");
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,copiedByShallow.getBooks().size());
        Assert.assertEquals(3,copiedByDeepCopy.getBooks().size());
    */
    }
}
