package com.mahe.MyFirstWebService.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {
	private String name;
	private long id;
	private Date createdDate;
	private String author;
	
	public Comment()
	{
		
	}
	
	public Comment(String name, long id,  String author) {

		this.name = name;
		this.id = id;
		this.createdDate = new Date();
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
