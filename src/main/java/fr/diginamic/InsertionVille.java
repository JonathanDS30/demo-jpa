package fr.diginamic;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVille {

	public static void main(String[] args) {

		// Création entityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		// Ouverture transaction
		transaction.begin();

		// Création des villes
		Ville vergeze = new Ville("Vergèze", 30310, new Date(), Categorie.PETITE);

		Ville montpellier = new Ville("Montpellier", 34000, new Date(), Categorie.GRANDE);

		// Reqûete pour insèrer dans la DB
		em.persist(vergeze);
		em.persist(montpellier);

		// Fin transaction
		transaction.commit();

	}

}
