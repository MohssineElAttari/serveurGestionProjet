package ma.ofppt.projet.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;

	@OneToMany(mappedBy = "session")
	private List<Projet> projet;

	@OneToMany(mappedBy = "session")
	private List<Criteres> criteres;

	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Session(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Projet> getProjet() {
		return projet;
	}

	public void setProjet(List<Projet> projet) {
		this.projet = projet;
	}

	public List<Criteres> getCriteres() {
		return criteres;
	}

	public void setCriteres(List<Criteres> criteres) {
		this.criteres = criteres;
	}

}
