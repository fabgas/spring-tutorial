package org.alma.hibernate;

import java.util.List;

import org.alma.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			// on peut utiliser la session object to save/retrieve Java objects
			// create a Student object
//			session = query(factory, session);
//			update(factory);
			delete(factory);
		}
		finally {
			session.close();
		}

	}
	private static Session query(SessionFactory factory, Session session) {
		Student tempStudent = new Student( "John", "duck2", "jduck@gmail.com");
		session.beginTransaction();
		session.save(tempStudent);
		session.getTransaction().commit();
		session = factory.getCurrentSession();
		session.beginTransaction();
		Student myStudent = session.get(Student.class,tempStudent.getId());
		System.err.println(myStudent);
		List<Student> theStudents = session.createQuery("from Student s where s.lastName='duck'").getResultList();
		System.err.println(theStudents.size());
		theStudents = session.createQuery("from Student s where s.lastName LIKE '%duck%'").getResultList();
		
		theStudents.stream().forEach(student -> System.out.println(student));
		session.getTransaction().commit();
		return session;
	}
	
	public static void update(final SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Student myStudent = session.get(Student.class,1);
		myStudent.setFirstName("Scooby");
		session.getTransaction().commit();
		session = factory.getCurrentSession();
		session.beginTransaction();
		session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
		session.getTransaction().commit();
	}
	
	public static void delete(final SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Student myStudent = session.get(Student.class,1);
		session.delete(myStudent);
		session.getTransaction().commit();
		
	}
}
