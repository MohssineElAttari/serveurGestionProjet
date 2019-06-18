package ma.ofppt.projet.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private float note;

	@ManyToOne
	@JoinColumn(name = "critereId")
	private Criteres criteres;

	@OneToMany(mappedBy = "note")
	List<EnseignantNote> enseignants;

	@OneToMany(mappedBy = "note")
	List<ProjetNote> projetNote;

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

	public Note(float note, Criteres criteres) {
		super();
		this.note = note;
		this.criteres = criteres;
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

}
