package com.example.demo.service;

import java.lang.reflect.Method;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Author;
import com.example.demo.repsoitory.AutorRepository;
@Service
public class AuthorServiceImpl implements AuthorService{
private AutorRepository autorRepository;

@Override
public Iterable<Author> List() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Author create(Author author) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Author read(long id) {
	// TODO Auto-generated method stub
	return null;
}
	
	
	
}
