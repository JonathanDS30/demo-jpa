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
		
		Region region1 = new Region();
		region1.setNom("occitanie"); // on mets le nom test
		em.persist(region1); // Requête SQL INSERT 


		// Création des villes
		Ville vergeze = new Ville();
		vergeze.setNom("Vergèze");
		vergeze.setCodePostal(30310);
		vergeze.setDateRecensement(new Date());
		vergeze.setCategorie(Categorie.PETITE);
		vergeze.setRegion(region1);
		

		Ville montpellier = new Ville();
		montpellier.setNom("Montpellier");
		montpellier.setCodePostal(34000);
		montpellier.setDateRecensement(new Date());
		montpellier.setCategorie(Categorie.GRANDE);
		montpellier.setRegion(region1);
		
		// Reqûete pour insèrer dans la DB
		em.persist(vergeze);
		em.persist(montpellier);
		
		Habitant hab1 = new Habitant();
		hab1.setNom("Leclerc");
		hab1.setPrenom("Charles");
		em.persist(hab1);
		
		vergeze.getHabitants().add(hab1);
		hab1.getVilles().add(montpellier);
		
		



		// Fin transaction
		transaction.commit();

	}

}
