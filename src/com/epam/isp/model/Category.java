package com.epam.isp.model;

public class Category {
 private int Id;
 private String name;
public Category(int id, String name) {
	this.Id = id;
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
 
}
