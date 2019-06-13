package ma.ofppt.projet.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Criteres {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String libelle;
	private Integer min;
	private Integer max;
	
	@OneToMany (mappedBy = "criteres")
	private List<Note> note;
	
	@ManyToOne
	@JoinColumn(name="sessionId")
	private Session session;
	
	public Criteres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Criteres(String libelle, Integer min, Integer max) {
		super();
		this.libelle = libelle;
		this.min = min;
		this.max = max;
	}
	
	

}
