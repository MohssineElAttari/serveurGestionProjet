package ma.ofppt.projet.entity;

import javax.persistence.Embeddable;

@Embeddable
public class EnseignantNoteKey {
	private Long enseignant_id;

	private Long note_id;

	public EnseignantNoteKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantNoteKey(Long enseignant_id, Long note_id) {
		super();
		this.enseignant_id = enseignant_id;
		this.note_id = note_id;
	}

	public Long getEnseignant_id() {
		return enseignant_id;
	}

	public void setEnseignant_id(Long enseignant_id) {
		this.enseignant_id = enseignant_id;
	}

	public Long getNote_id() {
		return note_id;
	}

	public void setNote_id(Long note_id) {
		this.note_id = note_id;
	}

}
