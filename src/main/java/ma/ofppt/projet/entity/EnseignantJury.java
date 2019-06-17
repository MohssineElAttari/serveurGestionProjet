package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class EnseignantJury {
	@EmbeddedId
	EnseignantJuryKey id;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "enseignant_id", referencedColumnName = "enseignantId", insertable = false, updatable = false)
	Enseignant enseignant;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "jury_id", referencedColumnName = "id", insertable = false, updatable = false)
	Jury jury;

	private String role;

	@ManyToOne
	@JoinColumn(name = "anneeScolaireId")
	private AnneeScolaire anneeScolaire;

	public EnseignantJury() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantJury(EnseignantJuryKey id, Enseignant enseignant, Jury jury, String role) {
		super();
		this.id = id;
		this.enseignant = enseignant;
		this.jury = jury;
		this.role = role;
	}

	public EnseignantJuryKey getId() {
		return id;
	}

	public void setId(EnseignantJuryKey id) {
		this.id = id;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

}
