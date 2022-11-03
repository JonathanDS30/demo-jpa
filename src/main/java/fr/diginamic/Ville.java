package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "VILLE")

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
	
	@ManyToOne
	@JoinColumn(name = "ID_REGION")
	private Region region;
	
	@ManyToMany
	@JoinTable(name = "LIEN_VILLE_HABITANT",
				joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_HABITANT", referencedColumnName = "ID"))
	private List<Habitant> habitants = new ArrayList<Habitant>();


	public Ville() {

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

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the habitants
	 */
	public List<Habitant> getHabitants() {
		return habitants;
	}

}
