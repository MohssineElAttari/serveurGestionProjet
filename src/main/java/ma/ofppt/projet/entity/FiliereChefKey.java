package ma.ofppt.projet.entity;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class FiliereChefKey {
	private Long filier;
	private Long chef;
	private Date dateDebut;

	public FiliereChefKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiliereChefKey(Long filier, Long chef, Date dateDebut) {
		super();
		this.filier = filier;
		this.chef = chef;
		this.dateDebut = dateDebut;
	}

	public Long getFilier() {
		return filier;
	}

	public void setFilier(Long filier) {
		this.filier = filier;
	}

	public Long getChef() {
		return chef;
	}

	public void setChef(Long chef) {
		this.chef = chef;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

}
