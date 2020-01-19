package com.app;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Volunteer implements Serializable
{
/**
	 * 
	 */
	
private String name;
private List<String> hobbies=new ArrayList<String>();
private boolean isAvailable;
private LocalDate dob;


public Volunteer() {
	
	
}
public Volunteer(String name, boolean isAvailable, LocalDate dob) {
	super();
	this.name = name;
	this.isAvailable = isAvailable;
	this.dob = dob;
	
}
public Volunteer(String name2) {
	
	name=name2;
}
@Override
public String toString() {
	return "Volunteer [name=" + name + ", hobbies=" + hobbies + ", isAvailable=" + isAvailable + ", dob=" + dob + "]";
}

public void addHobby(String h)
{
	hobbies.add(h);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Volunteer))
		return false;
	Volunteer other = (Volunteer) obj;
	if (dob == null) {
		if (other.dob != null)
			return false;
	} else if (!dob.equals(other.dob))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}




