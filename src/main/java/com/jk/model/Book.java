package com.jk.model;

import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class Book {

 private    String    bookid;	
	
 private    String    bookname;
 
 private    Integer     price;
 
 private    String     author;

 private    HashMap<String, String>    redMap;
 
 
public HashMap<String, String> getRedMap() {
	return redMap;
}

public void setRedMap(HashMap<String, String> redMap) {
	this.redMap = redMap;
}

public String getBookid() {
	return bookid;
}

public void setBookid(String bookid) {
	this.bookid = bookid;
}

public String getBookname() {
	return bookname;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
	

 
 
 
 
 
}
