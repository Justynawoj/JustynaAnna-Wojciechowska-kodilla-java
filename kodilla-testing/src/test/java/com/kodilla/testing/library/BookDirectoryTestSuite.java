package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf0(){
        // Given
        LibraryUser noBooksUser = new LibraryUser("John", "Farmer","1425653");
        List<Book> listOfNoBooks = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(noBooksUser)).thenReturn(listOfNoBooks);

        // When
        List<Book> zeroBooks = bookLibrary.listBookInHandsOf(noBooksUser);
        // Then
        assertEquals(0,zeroBooks.size());

    }
    @Test
    public void testListBooksInHandsOf1(){
        // Given
        LibraryUser oneBookUser = new LibraryUser("One", "Book","1425653");
        List<Book> listOf1Book = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(oneBookUser)).thenReturn(listOf1Book);

        // When
        List<Book> oneBook = bookLibrary.listBookInHandsOf(oneBookUser);

        // Then
        assertEquals(1,oneBook.size());
    }

    @Test
    public void testListBooksInHandsOf5(){
        // Given
        LibraryUser fiveBooksUser = new LibraryUser("Five", "Books","1425653");
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(fiveBooksUser)).thenReturn(listOf5Books);

        // When
        List<Book> fiveBooks = bookLibrary.listBookInHandsOf(fiveBooksUser);

        // Then
        assertEquals(5,fiveBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}