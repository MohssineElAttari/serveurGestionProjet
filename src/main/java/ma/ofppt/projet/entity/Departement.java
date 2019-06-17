package ma.ofppt.projet.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String libelle;

	@OneToMany(mappedBy = "departement")
	private List<Filiere> filiere;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name="DepartementChef", joinColumns
	 * = @JoinColumn(name="Departement_id"), inverseJoinColumns = @JoinColumn(name=
	 * "Enseignant_id")) Set<Enseignant> avoirChefDepartement;
	 */

//	@ManyToOne
//	@JoinColumn(name = "anneeScolaire_id")
//	private AnneeScolaire anneeScoDep;

	public Departement() {
		super();
	}

	public Departement(Long id, String nom, String libelle) {
		super();
		this.id = id;
		this.nom = nom;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
