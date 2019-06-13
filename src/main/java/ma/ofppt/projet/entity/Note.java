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
	private Float note;

	@ManyToOne
	@JoinColumn(name="critereId")
	private Criteres criteres;

	@ManyToMany(mappedBy ="noter")
	Set<Enseignant> notedonee;
	
	@ManyToMany(mappedBy = "belongsTo")
	Set<Projet> AvoirNote;
	
	
public Float getNote() {
	return note;
}

public void setNote(Float note) {
	this.note = note;
}

public Note() {
	super();
	// TODO Auto-generated constructor stub
}

public Note(Float note) {
	super();
	this.note = note;
}
}
