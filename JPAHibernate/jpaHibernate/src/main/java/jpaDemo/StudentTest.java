package jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
        Student s1 = new Student("Ramsy99");
        em.persist(s1);
        
//        Student s2=em.find(Student.class, 1);
//        System.out.println(s2);
//        
//        s2.setName("Ram");
//        em.merge(s2);
//        System.out.println(em.find(Student.class, 1));
//        
//		Student s3=em.find(Student.class,9);		
//        em.remove(s3);
        
        em.getTransaction().commit();
        em.close();
    }
}