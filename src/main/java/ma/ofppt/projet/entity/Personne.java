package ma.ofppt.projet.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ch.qos.logback.classic.db.names.TableName;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	protected Long id;
	protected Number matricule;
	protected String nom;
	protected String prenom;
	@Temporal(TemporalType.DATE)
	protected Date date_naissance;
	protected String adresse;
	protected Number tel;
	protected String statut;
	public Personne() {
		super();
	}
	
	public Personne(Number matricule, String nom, String prenom, Date date_naissance, String adresse,
			Number tel, String statut) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.adresse = adresse;
		this.tel = tel;
		this.statut = statut;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Number getMatricule() {
		return matricule;
	}
	public void setMatricule(Number matricule) {
		this.matricule = matricule;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Number getTel() {
		return tel;
	}
	public void setTel(Number tel) {
		this.tel = tel;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}
