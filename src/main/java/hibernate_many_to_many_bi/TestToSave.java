package hibernate_many_to_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestToSave {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Sunil");
		s1.setEmail("sunil@gmail.com");

		Subject sub1 = new Subject();
		sub1.setId(301);
		sub1.setName("HTML");
		sub1.setDays(89);

		Subject sub2 = new Subject();
		sub2.setId(401);
		sub2.setName("CSS");
		sub2.setDays(25);

		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(sub1);
		subjects.add(sub2);
		s1.setSubjects(subjects);

		et.begin();
		em.persist(s1);
		em.persist(sub1);
		em.persist(sub2);
		et.commit();

	}
}
