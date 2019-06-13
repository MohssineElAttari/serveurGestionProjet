package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EnseignantNoteKey {
	@EmbeddedId
	private EnseignantNoteKey id;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "enseignant_id" , referencedColumnName = "id", insertable = false , updatable = false)
	private Enseignant enseignant;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "note_id", referencedColumnName = "id", insertable = false , updatable = false)
	private Note note;

	public EnseignantNoteKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantNoteKey(EnseignantNoteKey id, Enseignant enseignant, Note note) {
		super();
		this.id = id;
		this.enseignant = enseignant;
		this.note = note;
	}

	public EnseignantNoteKey getId() {
		return id;
	}

	public void setId(EnseignantNoteKey id) {
		this.id = id;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}
	
	
	
	

}
