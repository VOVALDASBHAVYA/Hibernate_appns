package com.ojas.cnstr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GROUP")

public class Group {
	@Id
	@GeneratedValue
	@Column(name = "GROUP_ID") // (strategy=GenerationType.AUTO)
	public int id;
	public String name;
	@ManyToMany
	public List<User> users;


	public Group( String name, List<User> users) {
		this.name = name;
		this.users = users;
	}

	// @JoinTable(name = "User_group",
	// joinColumns={@JoinColumn(name="grp_id")},
	// inverseJoinColumns={@JoinColumn(name="user_id")})

	

	public Group() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	// public Group(Set<User> users) {//doubt
	// super();
	// this.users = users;
	// }

}