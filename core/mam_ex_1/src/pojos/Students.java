package pojos;

public class Students {

	private int id,marks,course_id;
	private String name,email,address;
	
	

	public Students(int marks, int course_id, String name, String email, String address) {
		super();
		this.marks = marks;
		this.course_id = course_id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Students(int id, int marks, int course_id, String name, String email, String address) {
		
		this.id = id;
		this.marks = marks;
		this.course_id = course_id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", marks=" + marks + ", course_id=" + course_id + ", name=" + name + ", email="
				+ email + ", address=" + address + "]";
	}
	
	
}
