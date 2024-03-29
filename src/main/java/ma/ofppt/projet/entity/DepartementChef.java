package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class DepartementChef {
	@EmbeddedId
	private DepartementChefKey id;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "departement_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Departement departement;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "enseignant_id", referencedColumnName = "enseignantId", insertable = false, updatable = false)
	private Enseignant enseignant;

	@ManyToOne
	@JoinColumn(name = "anneeScolaire_id")
	private AnneeScolaire anneeChefProj;

	public DepartementChef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartementChef(DepartementChefKey id, Departement departement, Enseignant enseignant) {
		super();
		this.id = id;
		this.departement = departement;
		this.enseignant = enseignant;
	}

	public DepartementChefKey getId() {
		return id;
	}

	public void setId(DepartementChefKey id) {
		this.id = id;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public AnneeScolaire getAnneeChefProj() {
		return anneeChefProj;
	}

	public void setAnneeChefProj(AnneeScolaire anneeChefProj) {
		this.anneeChefProj = anneeChefProj;
	}

}
