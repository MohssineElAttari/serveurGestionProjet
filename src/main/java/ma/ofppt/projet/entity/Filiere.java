package ma.ofppt.projet.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filiere  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name="departement_id")
	private Departement departement;
	
	@OneToMany(mappedBy = "filiere_id")
	private List<Niveau> niveau;
	
	@ManyToMany
	@JoinTable(
			name="FiliereChef",
			joinColumns = @JoinColumn(name="filiere_id"),
			inverseJoinColumns = @JoinColumn(name="enseignant_id"))
	Set<Enseignant> avoirChefFiliere;
	
	@ManyToOne
	@JoinColumn(name="anneeScolaire_id")
	private AnneeScolaire anneeScoFilChef;
	
	public Filiere() {
		super();
	}
	public Filiere(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
