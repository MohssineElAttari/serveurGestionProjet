package ma.ofppt.projet.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ProjetNote {
	@EmbeddedId
	private ProjetNoteKey id;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "projet_id" , referencedColumnName = "id", insertable = false , updatable = false)
	private Projet projet;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "note_id" , referencedColumnName = "id", insertable = false , updatable = false)
	private Note note;

	@ManyToOne
	@JoinColumn(name = "anneeScolaire_id")
	private AnneeScolaire anneeScoProNote;

	public ProjetNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjetNote(ProjetNoteKey id, Projet projet, Note note, AnneeScolaire anneeScoProNote) {
		super();
		this.id = id;
		this.projet = projet;
		this.note = note;
		this.anneeScoProNote = anneeScoProNote;
	}

	public ProjetNoteKey getId() {
		return id;
	}

	public void setId(ProjetNoteKey id) {
		this.id = id;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public AnneeScolaire getAnneeScoProNote() {
		return anneeScoProNote;
	}

	public void setAnneeScoProNote(AnneeScolaire anneeScoProNote) {
		this.anneeScoProNote = anneeScoProNote;
	}	
}
