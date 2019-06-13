package ma.ofppt.projet.entity;
import java.sql.Date;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

//import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class AnneeScolaire {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="anneeScolaireId")
	private Long id;
	private Date annee;
	
	@OneToMany(mappedBy = "anneeScoDep")//
	private List<DepartementChef> departementChef;//
	@OneToMany(mappedBy = "anneeScoEnsJury")//
	private List<EnseignantJury> enseignantJury;//
	@OneToMany(mappedBy = "anneeScoEtuProj")//
	private List<EtudiantProjet> etudiantProjet;//
	@OneToMany(mappedBy = "anneeScoFilChef")
	private List<FiliereChef> filiereChef;
	@OneToMany(mappedBy = "anneeScoProNote")//
	private List<ProjetNote> projetNote;//
	@OneToMany(mappedBy = "anneeScoEnsNote")//
	private List<EnseignantNote> enseignantnote;//
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public AnneeScolaire(Long id, Date annee) {
		super();
		this.id = id;
		this.annee = annee;
	}
	public AnneeScolaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
