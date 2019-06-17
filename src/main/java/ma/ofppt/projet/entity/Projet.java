package ma.ofppt.projet.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;
	private String description;
	private Integer etat;
	private Float note;

	@ManyToOne
	@JoinColumn(name = "sessionId")
	private Session session;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projet", cascade = CascadeType.ALL)
	private List<EtudiantProjet> etudiantProjets;
	@ManyToOne
	@JoinColumn(name = "juryId")
	private Jury jury;

	@ManyToOne
	@JoinColumn(name = "enseignantId")
	private Enseignant enseignant;

//	@ManyToMany
////	@JoinTable(
////			name="ProjetNote",
////			joinColumns = @JoinColumn(name="projet_id"),
////			inverseJoinColumns = @JoinColumn(name="note_id"))
//
//	@ManyToOne
//	@JoinColumn(name = "ProjetNote_id")
//	private AnneeScolaire anneeScoProNote;
////	Set<Note> belongsTo;
//
////	@ManyToMany(mappedBy = "avoirChoisi")
////	Set<Etudiant> choisir;

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projet(String theme, String description, Integer etat) {
		super();
		this.theme = theme;
		this.description = description;
		this.etat = etat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEtat() {
		return etat;
	}

	public void setEtat(Integer etat) {
		this.etat = etat;
	}

	public Float getNote() {
		return note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public List<EtudiantProjet> getEtudiantProjets() {
		return etudiantProjets;
	}

	public void setEtudiantProjets(List<EtudiantProjet> etudiantProjets) {
		this.etudiantProjets = etudiantProjets;
	}

	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	
	
}
