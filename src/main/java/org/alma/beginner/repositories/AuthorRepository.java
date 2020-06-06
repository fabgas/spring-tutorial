package org.alma.beginner.repositories;

import org.alma.beginner.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
