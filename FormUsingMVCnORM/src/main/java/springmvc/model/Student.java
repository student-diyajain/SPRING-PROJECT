package springmvc.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Id;	
private String name;
private String email;
private String password;
private String courses;
private String gender;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "user [name=" + name + ", email=" + email + ", password=" + password + ", courses=" + courses + ", gender="
			+ gender + "]";
}


}
