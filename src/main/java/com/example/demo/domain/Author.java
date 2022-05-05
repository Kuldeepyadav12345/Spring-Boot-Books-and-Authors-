package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Author {
	@Id
	@GeneratedValue
private long id;
private String firstname;
private String lastname;



//Books it created by directional relationship between two classes
@OneToMany(mappedBy = "author")
private List<Book> books;

public List<Book> getBooks() {
	return books;
}


public void setBooks(List<Book> books) {
	this.books = books;
}







public Author() {
	
}


public Author(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "Author [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
}


}
