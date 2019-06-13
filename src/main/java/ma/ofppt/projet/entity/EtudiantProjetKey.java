package ma.ofppt.projet.entity;

public class EtudiantProjetKey {
	private Long etudiant_id;
	private Long projet_id;
	private AnneeScolaire anneeScolaire;
	

	public EtudiantProjetKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EtudiantProjetKey(Long etudiant_id, Long projet_id, AnneeScolaire anneeScolaire) {
		super();
		this.etudiant_id = etudiant_id;
		this.projet_id = projet_id;
		this.anneeScolaire = anneeScolaire;
	}

	public Long getEtudiant_id() {
		return etudiant_id;
	}

	public void setEtudiant_id(Long etudiant_id) {
		this.etudiant_id = etudiant_id;
	}

	public Long getProjet_id() {
		return projet_id;
	}

	public void setProjet_id(Long projet_id) {
		this.projet_id = projet_id;
	}

	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	
	

}
