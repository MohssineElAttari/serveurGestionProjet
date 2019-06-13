package ma.ofppt.projet.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class RoleJury {
	@EmbeddedId
	RoleJuryKey	id;
	
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
	
	String role;

	public RoleJuryKey getId() {
		return id;
	}

	public void setId(RoleJuryKey id) {
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

	public RoleJury(RoleJuryKey id, Enseignant enseignant, Jury jury, String role) {
		super();
		this.id = id;
		this.enseignant = enseignant;
		this.jury = jury;
		this.role = role;
	}

	public RoleJury() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
