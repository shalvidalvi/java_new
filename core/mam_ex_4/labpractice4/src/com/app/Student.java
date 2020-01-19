package com.app;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable{
private int id;
private String name;
private int age;
private LocalDate date;
public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


public Student(int id, String name, int age, LocalDate date) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.date = date;
}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}


public Student() {
	super();
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	return true;
}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Student other = (Student) obj; if (id != other.id) return false;
	 * return true; }
	 * 
	 */


}
