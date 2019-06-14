package ma.ofppt.projet.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private float note;

	@ManyToOne
	@JoinColumn(name = "critereId")
	private Criteres criteres;

	@ManyToMany(mappedBy = "noter")
	Set<Enseignant> notedonee;

	@ManyToMany(mappedBy = "belongsTo")
	Set<Projet> AvoirNote;

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(float note, Criteres criteres, Set<Enseignant> notedonee, Set<Projet> avoirNote) {
		super();
		this.note = note;
		this.criteres = criteres;
		this.notedonee = notedonee;
		AvoirNote = avoirNote;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Criteres getCriteres() {
		return criteres;
	}

	public void setCriteres(Criteres criteres) {
		this.criteres = criteres;
	}

	public Set<Enseignant> getNotedonee() {
		return notedonee;
	}

	public void setNotedonee(Set<Enseignant> notedonee) {
		this.notedonee = notedonee;
	}

	public Set<Projet> getAvoirNote() {
		return AvoirNote;
	}

	public void setAvoirNote(Set<Projet> avoirNote) {
		AvoirNote = avoirNote;
	}

}
