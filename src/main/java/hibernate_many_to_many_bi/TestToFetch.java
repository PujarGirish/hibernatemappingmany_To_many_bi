package hibernate_many_to_many_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestToFetch {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	 
Subject sub=em.find(Subject.class, 301);
System.out.println(sub.getName());
System.out.println(sub.getId());
System.out.println(sub.getDays());

List<Student> students=sub.getStudents();
for (Student student : students) {
System.out.println("student details");
System.out.println(student.getId());
System.out.println(student.getName());
System.out.println(student.getEmail());
}
}
}
