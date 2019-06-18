package ma.ofppt.projet.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class AnneeScolaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "anneeScolaireId")
	private Long id;
	private String annee;

	public AnneeScolaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnneeScolaire(String annee) {
		super();
		this.annee = annee;
	}

	@OneToMany(mappedBy = "anneeChefProj")
	private List<DepartementChef> departementChef;
	@OneToMany(mappedBy = "anneeScolaire")
	private List<EnseignantJury> enseignantJury;
	@OneToMany(mappedBy = "anneeScoEtuProj")
	private List<EtudiantProjet> etudiantProjet;
	@OneToMany(mappedBy = "anneeScoFilChef")
	private List<FiliereChef> filiereChef;
	@OneToMany(mappedBy = "anneeScoProNote")
	private List<ProjetNote> projetNote;
	@OneToMany(mappedBy = "anneeScoEnsNote")
	private List<EnseignantNote> enseignantnote;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public AnneeScolaire(Long id, String annee) {
		super();
		this.id = id;
		this.annee = annee;
	}

}
