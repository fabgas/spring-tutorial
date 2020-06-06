package org.alma.beginner.bootstrap;

import org.alma.beginner.domain.Author;
import org.alma.beginner.domain.Book;
import org.alma.beginner.domain.Publisher;
import org.alma.beginner.repositories.AuthorRepository;
import org.alma.beginner.repositories.BookRepository;
import org.alma.beginner.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Eric","Evans");
        Book book = new Book("DDD","isbn1");
        Publisher publisher = new Publisher( "Manning","L'alma", "NY", "NJ", "44");
        publisherRepository.save(publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);
        book.setPublisher(publisher);
        authorRepository.save(author);
        this.bookRepository.save(book);
        publisher.getBooks().add(book);
        publisherRepository.save(publisher);
        Author rod = new Author("johnson","rod");
        Book bookRod = new Book("NoJEE","isbn2");
        bookRod.setPublisher(publisher);
        rod.getBooks().add(bookRod);
        publisher.getBooks().add(bookRod);
        bookRod.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(bookRod);
        publisherRepository.save(publisher);

        Publisher publish = publisherRepository.findAll().iterator().next();
        System.out.print("publish" + publish.getBooks().size());
    }
}
