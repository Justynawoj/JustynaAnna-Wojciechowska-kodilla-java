package com.kodilla.hibernate.test;

import java.util.Arrays;
import java.util.Optional;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorRepositoryTest extends TestCase {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void sample(){

        //Given
        Author author = new Author();
        author.setName("Sapkowski");
        authorRepository.save(author);

        Book book1 = new Book();
        book1.setTitle("book1");
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setTitle("book2");
        book2.setAuthor(author);

        bookRepository.saveAll(Arrays.asList(book1, book2));

        //When
        Optional<Author> authorOptional = authorRepository.findById(author.getId());
        
        //Then
        System.out.println();
    }

}