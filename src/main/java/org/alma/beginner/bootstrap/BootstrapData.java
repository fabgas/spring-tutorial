package org.alma.beginner.bootstrap;

import org.alma.beginner.domain.Author;
import org.alma.beginner.domain.Book;
import org.alma.beginner.repositories.AuthorRepository;
import org.alma.beginner.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Eric","Evans");
        Book book = new Book("DDD","isbn1");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        authorRepository.save(author);
        this.bookRepository.save(book);
        Author rod = new Author("johnson","rod");
        Book bookRod = new Book("NoJEE","isbn2");
        rod.getBooks().add(bookRod);
        bookRod.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(bookRod);
        System.out.print("counter" + authorRepository.count());
    }
}
