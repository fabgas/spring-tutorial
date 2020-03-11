package org.alma.hibernate;

import java.util.List;

import org.alma.hibernate.entity.Course;
import org.alma.hibernate.entity.Instructor;
import org.alma.hibernate.entity.InstructorDetail;
import org.alma.hibernate.entity.Review;
import org.alma.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateOneToMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernateOneToOne.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
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
		session.beginTransaction();
		
		Instructor instructor = session.get(Instructor.class,3);
		InstructorDetail detail = new InstructorDetail("youtube","football");
		Course course = new Course("Mathematics");
		Course course2 = new Course("Physics");
		Review review1 = new Review("bof");
		Review review2 = new Review("mieux");
		course.add(review1);
		course2.add(review2);
		instructor.setInstructorDetail(detail);
		instructor.addCourse(course2);
		instructor.addCourse(course);
		session.save(course);
		session.save(course2);
		session.getTransaction().commit();
		return session;
	}
	private static Session query(SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Instructor instructor = session.get(Instructor.class,3);

		System.err.println(instructor.getInstructorDetail());
		System.err.println(instructor.getCourses().size());
		session.getTransaction().commit();
		System.err.println(instructor);
		return session;
	}
	
	public static void update(final SessionFactory factory) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Instructor instructor = session.get(Instructor.class,3);
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
