package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class EnseignantNote {
	@EmbeddedId
	private EnseignantNoteKey id;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "enseingnant_id", referencedColumnName = "enseignantId", insertable = false, updatable = false)
	private Enseignant enseingnant;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "note_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Note note;

	@ManyToOne
	@JoinColumn(name = "anneeScolaire_id")
	private AnneeScolaire anneeScoEnsNote;

	public EnseignantNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantNote(EnseignantNoteKey id, Enseignant enseingnant, Note note) {
		super();
		this.id = id;
		this.enseingnant = enseingnant;
		this.note = note;
	}

	public EnseignantNoteKey getId() {
		return id;
	}

	public void setId(EnseignantNoteKey id) {
		this.id = id;
	}

	public Enseignant getEnseingnant() {
		return enseingnant;
	}

	public void setEnseingnant(Enseignant enseingnant) {
		this.enseingnant = enseingnant;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public AnneeScolaire getAnneeScoEnsNote() {
		return anneeScoEnsNote;
	}

	public void setAnneeScoEnsNote(AnneeScolaire anneeScoEnsNote) {
		this.anneeScoEnsNote = anneeScoEnsNote;
	}

	

}
