	
public class Student {
private String name;
private String email;
private String phone;
private String faculty;
private Subject [] subjectGrades;

public Student() {
	super();

}

public Student(String name, String email, String phone, String faculty, Subject[] subjectGrades) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
	this.subjectGrades = subjectGrades;
}

public Student(String name, String faculty) {
	super();
	this.name = name;
	this.faculty = faculty;
}



public Student(String name, String email, String phone, String faculty) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}

public Subject[] getSubjectGrades() {
	return subjectGrades;
}

public void setSubjectGrades(Subject[] subjectGrades) {
	this.subjectGrades = subjectGrades;
}



}
