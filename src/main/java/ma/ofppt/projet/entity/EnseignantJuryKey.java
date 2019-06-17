package ma.ofppt.projet.entity;

import javax.persistence.Embeddable;


import java.io.Serializable;

@Embeddable
public class EnseignantJuryKey implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long enseignant_id;
	private Long jury_id;
	

	public EnseignantJuryKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantJuryKey(Long enseignant_id, Long jury_id) {
		super();
		this.enseignant_id = enseignant_id;
		this.jury_id = jury_id;
	}

	public Long getEnseignant_id() {
		return enseignant_id;
	}

	public void setEnseignant_id(Long enseignant_id) {
		this.enseignant_id = enseignant_id;
	}

	public Long getJury_id() {
		return jury_id;
	}

	public void setJury_id(Long jury_id) {
		this.jury_id = jury_id;
	}

}
