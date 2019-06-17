package ma.ofppt.projet.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ProjetNoteKey {
	private Long note_id;
	private Long projet_id;

	public ProjetNoteKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjetNoteKey(Long note_id, Long projet_id) {
		super();
		this.note_id = note_id;
		this.projet_id = projet_id;
	}

	public Long getNote_id() {
		return note_id;
	}

	public void setNote_id(Long note_id) {
		this.note_id = note_id;
	}

	public Long getProjet_id() {
		return projet_id;
	}

	public void setProjet_id(Long projet_id) {
		this.projet_id = projet_id;
	}
}
