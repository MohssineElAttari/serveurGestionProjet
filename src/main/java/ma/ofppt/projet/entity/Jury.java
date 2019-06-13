package ma.ofppt.projet.entity;

import java.util.List;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jury {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	private String code;
	
	@OneToMany(mappedBy = "jury")
	private List<Projet> projet;
	
	@OneToMany(mappedBy = "jury")
	Set<EnseignantJury> roles;
	
	public Jury() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jury(Integer id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
