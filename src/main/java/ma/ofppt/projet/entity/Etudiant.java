package ma.ofppt.projet.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name="etudiantId")
public class Etudiant extends Personne{
	
	private String cne;
	
	@ManyToOne
	@JoinColumn(name="groupeId")
	private Groupe groupe;

	@ManyToMany
	@JoinTable(
			name="EtudiantProjet",
			joinColumns = @JoinColumn(name="etudiant_id"),
			inverseJoinColumns = @JoinColumn(name="projet_id"))
	@ManyToOne
	@JoinColumn(name="anneeScolaire_id")
	private AnneeScolaire anneeScoEtuProj;
	Set<Projet> avoirChoisi;
	
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant( Number matricule, String nom, String prenom, Date date_naissance, String adresse,
			Number tel, String statut) {
		super(matricule, nom, prenom, date_naissance, adresse, tel, statut);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String cne) {
		super();
		this.cne = cne;
	}
	
	
}
