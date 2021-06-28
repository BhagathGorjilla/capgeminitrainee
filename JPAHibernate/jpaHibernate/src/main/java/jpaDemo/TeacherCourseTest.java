package jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TeacherCourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
        Teacher t1=new Teacher(1,"Teacher1",12000);
        em.persist(t1);
        
        Course c1=new Course(101,"JAVA",549,t1);
        Course c2=new Course(102,"HTML",199,t1);
        em.persist(c1);
        em.persist(c2);
        
        Teacher t2=new Teacher(2,"Teacher2",15000);
        em.persist(t2);
       
    
        
        em.getTransaction().commit();
        em.close();

	}

}
