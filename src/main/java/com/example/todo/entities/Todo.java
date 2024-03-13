package com.example.todo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Todo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int  id;
private String title;
private String note;
	
public Todo(int id, String title, String note) {
	super();
	this.id = id;
	this.title = title;
	this.note = note;
}

public Todo() {
	super();
	
	}

public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getnote() {
		return note;
	}

	public void String(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", note=" + note + "]";
	}


}
