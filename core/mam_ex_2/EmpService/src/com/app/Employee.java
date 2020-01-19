package com.app;

import java.time.LocalDate;

public class Employee 
{
private int id;
private String name;
private LocalDate dob,hireDate;
private double salary;
private String department;

public Employee(int id, String name, LocalDate dob, LocalDate hireDate, double salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.hireDate = hireDate;
	this.salary = salary;
	this.department = department;
	
}

public Employee(int id2) {
	id=id2;
}

public Employee(LocalDate d1) {
hireDate=d1;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", hireDate=" + hireDate + ", salary=" + salary
			+ ", department=" + department + "]";
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Employee))
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	return true;
}


}
//. Add Employee: id(unique), name, dob, hireDate, salary and department