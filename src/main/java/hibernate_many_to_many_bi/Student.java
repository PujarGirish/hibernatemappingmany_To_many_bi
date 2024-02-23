package hibernate_many_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//this will pgm will avoid creating 3rd and 4th table ie is 
//subject_student and student_subject if dont join the table then 3rd and 
// 4th table will be created

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="my_subject_id"),
	inverseJoinColumns =@JoinColumn(name="my_student_id") )

	private List<Subject> subjects;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
