package org.alma.beginner.repositories;

import org.alma.beginner.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends CrudRepository<Book,Long> {
}
