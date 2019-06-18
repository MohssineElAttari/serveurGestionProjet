package ma.ofppt.projet.entity;

import java.io.Serializable;

public class DepartementChefKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long departement_id;
	private Long enseignant_id;

//	private AnneeScolaire anneeScolaire;
	public DepartementChefKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartementChefKey(Long departement_id, Long enseignant_id) {
		super();
		this.departement_id = departement_id;
		this.enseignant_id = enseignant_id;
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

}
