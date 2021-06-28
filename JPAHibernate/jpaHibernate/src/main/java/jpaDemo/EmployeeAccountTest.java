package jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = factory.createEntityManager();
		
	   em.getTransaction().begin();
		
       Employee emp= new Employee(143,"Victor123",120000);
       em.persist(emp);
       System.out.println(emp);
       
       Account acc=new Account(198,"45123",14528);
       em.persist(acc);
      System.out.println(acc);
       
      emp.setAccount(acc);
      em.persist(emp);
       System.out.println(emp);
       
        
        em.getTransaction().commit();
        em.close();

	}

}
