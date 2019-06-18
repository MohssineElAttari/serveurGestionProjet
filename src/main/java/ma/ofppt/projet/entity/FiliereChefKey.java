package ma.ofppt.projet.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FiliereChefKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long filiere_id;
	private Long chef_id;

	public FiliereChefKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiliereChefKey(Long filiere_id, Long chef_id) {
		super();
		this.filiere_id = filiere_id;
		this.chef_id = chef_id;
	}

	public Long getFiliere_id() {
		return filiere_id;
	}

	public void setFiliere_id(Long filiere_id) {
		this.filiere_id = filiere_id;
	}

	public Long getChef_id() {
		return chef_id;
	}

	public void setChef_id(Long chef_id) {
		this.chef_id = chef_id;
	}

}
