package ma.ofppt.projet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class AnneeScolaire {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="anneeScolaireId")
	private Long id;
	private String annee;
	
//	@OneToMany(mappedBy = "anneeScoDep")
//	private List<DepartementChef> departementChef;
//	@OneToMany(mappedBy = "anneeScoEnsJury")
//	private List enseignantJury;
//	@OneToMany(mappedBy = "anneeScoEtuProj")
//	private List<EtudiantProjet> etudiantProjet;
//	@OneToMany(mappedBy = "anneeScoFilChef")
//	private List filiereChef;
//	@OneToMany(mappedBy = "anneeScoProNote")
//	private List projetNote;
//	@OneToMany(mappedBy = "anneeScoEnsNote")
//	private List enseignantnote;
	
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
	public AnneeScolaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
