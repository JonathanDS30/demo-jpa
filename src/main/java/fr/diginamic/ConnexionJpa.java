//package fr.diginamic;
//
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class ConnexionJpa {
//
//	public static void main(String[] args) {
//
//		// Création entityManager
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
//		EntityManager em = entityManagerFactory.createEntityManager();
//
//		// Création entityTransaction
//		// EntityTransaction transaction = em.getTransaction();
//
//		// Ouverture transaction
//		// transaction.begin();
//
//		// On créer notre nouvelle région 1
////		Region region1 = new Region();
////		region1.setNom("test"); // on mets le nom test
////		em.persist(region1); // Requête SQL INSERT 
////		transaction.commit();
//
//		Region recherche2 = em.find(Region.class, 1);
//		System.out.println(recherche2);
//
//
//	}
//
//}
