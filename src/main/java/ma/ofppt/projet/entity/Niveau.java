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
public class Niveau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private Integer code;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="filiere_id")
	private Filiere filiere;
	
	@OneToMany(mappedBy = "niveau")
	private List<Groupe> groupe;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(Integer code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}

}