package lab.basic.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("user");
			EntityManager em = emf.createEntityManager();
			User user = em.find(User.class, 1);
			System.out.println(user);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
