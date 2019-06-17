package ma.ofppt.projet.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EtudiantProjetKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long etudiant_id;
	private Long projet_id;

	public EtudiantProjetKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtudiantProjetKey(Long etudiant_id, Long projet_id) {
		super();
		this.etudiant_id = etudiant_id;
		this.projet_id = projet_id;
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
}
