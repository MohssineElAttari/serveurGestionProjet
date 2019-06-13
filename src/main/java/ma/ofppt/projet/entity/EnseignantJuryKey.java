package ma.ofppt.projet.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@SuppressWarnings("serial")
public class EnseignantJuryKey implements Serializable{
	@Column(name="enseignant_id")
	Integer enseignantId;
	
	@Column(name="jury_id")
	Integer juryId;
	
	private AnneeScolaire anneeScolaire;

	public EnseignantJuryKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseignantJuryKey(Integer enseignantId, Integer juryId, AnneeScolaire anneeScolaire) {
		super();
		this.enseignantId = enseignantId;
		this.juryId = juryId;
		this.anneeScolaire = anneeScolaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anneeScolaire == null) ? 0 : anneeScolaire.hashCode());
		result = prime * result + ((enseignantId == null) ? 0 : enseignantId.hashCode());
		result = prime * result + ((juryId == null) ? 0 : juryId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnseignantJuryKey other = (EnseignantJuryKey) obj;
		if (anneeScolaire == null) {
			if (other.anneeScolaire != null)
				return false;
		} else if (!anneeScolaire.equals(other.anneeScolaire))
			return false;
		if (enseignantId == null) {
			if (other.enseignantId != null)
				return false;
		} else if (!enseignantId.equals(other.enseignantId))
			return false;
		if (juryId == null) {
			if (other.juryId != null)
				return false;
		} else if (!juryId.equals(other.juryId))
			return false;
		return true;
	}

	public Integer getEseignantId() {
		return enseignantId;
	}

	public void setEseignantId(Integer eseignantId) {
		this.enseignantId = eseignantId;
	}

	public Integer getJuryId() {
		return juryId;
	}

	public void setJuryId(Integer juryId) {
		this.juryId = juryId;
	}

	public AnneeScolaire getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	
}
