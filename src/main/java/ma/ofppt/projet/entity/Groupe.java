package ma.ofppt.projet.entity;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "CODE")
	private String code;
	@Column(name = "LIBELLE")
	private String libelle;

	@ManyToOne
	@JoinColumn(name = "niveau_id")
	private Niveau niveau;

	@OneToMany(mappedBy = "groupe")
	private List<Etudiant> etudiant;

	public Groupe() {
		super();
	}

	public Groupe(String code, String libelle, Niveau niveau) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.niveau = niveau;
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

	public Niveau getNiveau() {
		return niveau;
	}

	public void setFilliere(Niveau niveau) {
		this.niveau = niveau;
	}

}