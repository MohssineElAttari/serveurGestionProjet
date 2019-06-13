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
	private Integer id;
	private String libelle;
	
	@OneToMany(mappedBy = "session")
	private List<Projet> projet;
	
	@OneToMany(mappedBy = "session")
	private List<Criteres> criteres;
	
	public Session(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
