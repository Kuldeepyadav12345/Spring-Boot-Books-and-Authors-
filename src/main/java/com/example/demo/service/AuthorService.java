package com.example.demo.service;

import com.example.demo.domain.Author;

public interface AuthorService {
public Iterable<Author> List();
public Author create(Author author);
public Author read(long id);
}
