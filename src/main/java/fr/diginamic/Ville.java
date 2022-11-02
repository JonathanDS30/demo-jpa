package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe qui permet d'insèrer des villes dans la table Ville
 * 
 * @author jonat
 *
 */
@Entity
@Table(name = "Ville")

public class Ville {

	// On génère l'autoincrémentation de l'ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 50, nullable = false, unique = false)
	private String nom;

	@Column(name = "CODE_POSTAL", nullable = false, unique = false)
	private int codePostal;

	@Column(name = "DATE_RECENSEMENT", length = 20)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRecensement;

	@Column(name = "CATEGORIE", nullable = true, unique = false)
	@Enumerated(EnumType.STRING)
	private Categorie categorie;

	/**
	 * @param nom
	 * @param codePostal
	 * @param dateRecensement
	 * @param categorie
	 */
	public Ville(String nom, int codePostal, Date dateRecensement, Categorie categorie) {
		super();
		this.nom = nom;
		this.codePostal = codePostal;
		this.dateRecensement = dateRecensement;
		this.categorie = categorie;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the dateRecensement
	 */
	public Date getDateRecensement() {
		return dateRecensement;
	}

	/**
	 * @param dateRecensement the dateRecensement to set
	 */
	public void setDateRecensement(Date dateRecensement) {
		this.dateRecensement = dateRecensement;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
