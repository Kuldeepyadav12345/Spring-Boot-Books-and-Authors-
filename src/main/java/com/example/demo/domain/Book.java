package com.example.demo.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//POJO
@Entity
public class Book {
	@Id
	@GeneratedValue
	
  private long id;
  private String title;
  private String desc;
  private Date pubdate;
  private int noofpage;
  
  
  
  
  
//Author 
//the getter setter will fetch the authors of particular books
  @ManyToOne()
	private Author author;
	
public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
public Book() {
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public Date getPubdate() {
	return pubdate;
}
public void setPubdate(Date pubdate) {
	this.pubdate = pubdate;
}
public int getNoofpage() {
	return noofpage;
}
public void setNoofpage(int noofpage) {
	this.noofpage = noofpage;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", desc=" + desc + ", pubdate=" + pubdate + ", noofpage=" + noofpage
			+ "]";
}
  
}
