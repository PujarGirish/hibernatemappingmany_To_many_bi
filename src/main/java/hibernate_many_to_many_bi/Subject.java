package hibernate_many_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
@Id
private int id;
private String name;
private int days;

@ManyToMany(mappedBy = "subjects")
List<Student> students;

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

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}


}
