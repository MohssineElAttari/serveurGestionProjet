package ma.ofppt.projet.entity;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="enseignantId")
public class Enseignant extends Personne {
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Date dateEmbauche;
	private String fonction;
	private String grade;
	
	@OneToMany(mappedBy = "enseignant")
	private List<Projet> projet;
	
	@OneToMany(mappedBy = "enseignant")
	Set<RoleJury> roles;
		
	@ManyToMany(mappedBy = "avoirChefDepartement")
	Set<Departement> chef;
	
	@ManyToMany
	@JoinTable(
			name="EnseignantNote",
			joinColumns = @JoinColumn(name="Enseignant_id"),
			inverseJoinColumns = @JoinColumn(name="Note_id"))
	Set<Note> noter;
	
	
	
	@ManyToOne
	@JoinColumn(name="anneeScolaire_id")
	private AnneeScolaire anneeScoEnsNote;
	
	

	@ManyToMany(mappedBy = "avoirChefFiliere")
	Set<Filiere> avoirchef;
	
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(Long id, Number matricule, String nom, String prenom, Date date_naissance, String adresse,
			Number tel, String statut) {
		super(id, matricule, nom, prenom, date_naissance, adresse, tel, statut);
		// TODO Auto-generated constructor stub
	}
	
	public Enseignant(Date dateEmbauche, String fonction, String grade){
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
