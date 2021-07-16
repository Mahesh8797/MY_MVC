package com.mahe.MyFirstWebService.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message 
{

	private String name;
	private long id;
	private Date createdDate;
	private String author;
	
	private Map<Long, Comment> comments= new HashMap<>();
	
	private List<Link> links=new ArrayList<>();
	
	
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public Message()
	{
		
	}
	
	public Message(String name, int id, String author) {
		this.name = name;
		this.id = id;
		this.author = author;
		this.createdDate=new Date();
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
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
	
	public void addLink(String url, String rel)
	{
		Link link=new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}
}
