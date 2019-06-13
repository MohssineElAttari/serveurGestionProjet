package ma.ofppt.projet.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class EnseignantJury {
	@EmbeddedId
	EnseignantJuryKey	id;
	
	@ManyToOne
	@MapsId("enseignant_id")
	@JoinColumn(name="enseignant_id")
	Enseignant enseignant;

	@ManyToOne
	@MapsId("jury_id")
	@JoinColumn(name="jury_id")
	Jury jury;
	
	@ManyToOne
	@JoinColumn(name="anneeScolaire_id")
	private AnneeScolaire anneeScoEnsJury;
	
	@ManyToOne
	@JoinColumn(name="anneeScolaire_id")
	private AnneeScolaire anneeScoEtuProj;
	
	String role;

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

	public EnseignantJury(EnseignantJuryKey id, Enseignant enseignant, Jury jury, String role) {
		super();
		this.id = id;
		this.enseignant = enseignant;
		this.jury = jury;
		this.role = role;
	}

	public EnseignantJury() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
