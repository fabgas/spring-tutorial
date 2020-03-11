package org.alma.hibernate;

import java.util.List;

import org.alma.hibernate.entity.Instructor;
import org.alma.hibernate.entity.InstructorDetail;
import org.alma.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOne {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernateOneToOne.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			// on peut utiliser la session object to save/retrieve Java objects
			// create a Student object
			session = create(factory,session);
			session = query(factory);
			update(factory);
			delete(factory);
		}
		finally {
			session.close();
		}

	}
	private static Session create(SessionFactory factory, Session session) {
		Instructor instructor = new Instructor("John", "Doe", "gg@gmail.com");
		InstructorDetail detail = new InstructorDetail("youtube","football");
		instructor.setInstructorDetail(detail);
		session.beginTransaction();
		session.save(instructor);
		session.getTransaction().commit();
		return session;
	}
	private static Session query(SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Instructor instructor = session.get(Instructor.class,1);
		
		session.getTransaction().commit();
		System.err.println(instructor);
		System.err.println(instructor.getInstructorDetail());
		return session;
	}
	
	public static void update(final SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Instructor instructor = session.get(Instructor.class,1);
		instructor.setFirstName("Scooby");
		session.getTransaction().commit();
		session = factory.getCurrentSession();
		session = factory.getCurrentSession();
		session.beginTransaction();
		 instructor = session.get(Instructor.class,1);
		session.getTransaction().commit();
		System.err.println(instructor);
	}
	
	public static void delete(final SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Instructor myStudent = session.get(Instructor.class,1);
		session.delete(myStudent);
		session.getTransaction().commit();
		session = factory.getCurrentSession();
		session.beginTransaction();
		InstructorDetail instructorDetail = session.get(InstructorDetail.class,1);
		session.getTransaction().commit();
		System.err.println(instructorDetail);
	}
}
