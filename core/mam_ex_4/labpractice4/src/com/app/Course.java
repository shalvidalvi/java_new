package com.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {

	private String name;
	private int cId;
	Student s;
	private List<Student> slist=new ArrayList<>();
	public Course() {
		
	}
	public Course(String name, int cId) {
		super();
		this.name = name;
		this.cId = cId;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", cId=" + cId + ", slist=" + slist + "]";
	}
	
	public void addStudent(Student s)
	{
		slist.add(s);
	}
	public void removeStudent(Student s)
	{
		slist.remove(s);
	}
	
}
