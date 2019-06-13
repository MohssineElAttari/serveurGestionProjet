package ma.ofppt.projet.entity;

import javax.persistence.Embeddable;

@Embeddable
public class FiliereChefKey {
	private Long filiere_id;
	private Long chef_id;
	private AnneeScolaire anneeScolaire;

	public FiliereChefKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiliereChefKey(Long filiere_id, Long chef_id, AnneeScolaire anneeScolaire) {
		super();
		this.filiere_id = filiere_id;
		this.chef_id = chef_id;
		this.anneeScolaire = anneeScolaire;
	}

	public Long getFiliere_id() {
		return filiere_id;
	}

	public void setFiliere_id(Long filiere_id) {
		this.filiere_id = filiere_id;
	}

	public Long getChef_id() {
		return chef_id;
	}

	public void setChef_id(Long chef_id) {
		this.chef_id = chef_id;
	}

	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setDateDebut(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

}
