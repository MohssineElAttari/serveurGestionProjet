package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FiliereChef {
	@Embedded
	private FiliereChefKey id;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "filier", referencedColumnName = "filiere", insertable = false, updatable = false)
	private Filiere filiere;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "chef", referencedColumnName = "chef", insertable = false, updatable = false)
	private Enseignant enseignant;

	public FiliereChef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiliereChef(FiliereChefKey id, Filiere filiere, Enseignant enseignant) {
		super();
		this.id = id;
		this.filiere = filiere;
		this.enseignant = enseignant;
	}

	public FiliereChefKey getId() {
		return id;
	}

	public void setId(FiliereChefKey id) {
		this.id = id;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

}
