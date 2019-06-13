package ma.ofppt.projet.entity;

	
public class DepartementChefKey {
	private Long departement_id;
	private Long enseignant_id;
	private AnneeScolaire anneeScolaire;
	public DepartementChefKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartementChefKey(Long departement_id, Long enseignant_id, AnneeScolaire anneeScolaire) {
		super();
		this.departement_id = departement_id;
		this.enseignant_id = enseignant_id;
		this.anneeScolaire = anneeScolaire;
	}
	public Long getDepartement_id() {
		return departement_id;
	}
	public void setDepartement_id(Long departement_id) {
		this.departement_id = departement_id;
	}
	public Long getEnseignant_id() {
		return enseignant_id;
	}
	public void setEnseignant_id(Long enseignant_id) {
		this.enseignant_id = enseignant_id;
	}
	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	
	

}
