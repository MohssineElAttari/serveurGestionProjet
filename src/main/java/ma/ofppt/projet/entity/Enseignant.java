package ma.ofppt.projet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name="enseignantId")
public class Enseignant extends Personne {
	@Temporal(TemporalType.DATE)
	private Date dateEmbauche;
	private String fonction;
	private String grade;

	@OneToMany(mappedBy = "enseignant")
	private List<Projet> projet;

	@OneToMany(mappedBy = "enseignant")
	List<EnseignantJury> enseignantJury;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(Number matricule, String nom, String prenom, Date date_naissance, String adresse, Number tel,
			String statut) {
		super(matricule, nom, prenom, date_naissance, adresse, tel, statut);
		// TODO Auto-generated constructor stub
	}

	public Enseignant(Date dateEmbauche, String fonction, String grade) {
		this.fonction = fonction;
		this.grade = grade;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
