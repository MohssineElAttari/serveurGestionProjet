package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EtudiantProjet {
	@EmbeddedId
	private EtudiantProjetKey id;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "etudiant_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Etudiant etudiant;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "projet_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Projet projet;

	@ManyToOne
	@JoinColumn(name = "anneeScolaire_id")
	private AnneeScolaire anneeScoEtuProj;

	public EtudiantProjet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtudiantProjet(EtudiantProjetKey id, Etudiant etudiant, Projet projet, AnneeScolaire anneeScoEtuProj) {
		super();
		this.id = id;
		this.etudiant = etudiant;
		this.projet = projet;
		this.anneeScoEtuProj = anneeScoEtuProj;
	}

	public EtudiantProjetKey getId() {
		return id;
	}

	public void setId(EtudiantProjetKey id) {
		this.id = id;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public AnneeScolaire getAnneeScoEtuProj() {
		return anneeScoEtuProj;
	}

	public void setAnneeScoEtuProj(AnneeScolaire anneeScoEtuProj) {
		this.anneeScoEtuProj = anneeScoEtuProj;
	}
	
	
	

}
