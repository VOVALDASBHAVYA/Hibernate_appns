package com.ojas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="AUTHOR")
public class Author {
@Id
	public int authorId;
	public String name;

	public Author() {
	}

	public Author(int authorId, String name) {
		this.authorId = authorId;
		this.name = name;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
