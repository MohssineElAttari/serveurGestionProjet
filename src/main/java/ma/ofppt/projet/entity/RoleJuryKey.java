package ma.ofppt.projet.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@SuppressWarnings("serial")
public class RoleJuryKey implements Serializable{
	@Column(name="enseignant_id")
	Integer eseignantId;
	
	@Column(name="jury_id")
	Integer juryId;

	public Integer getEseignantId() {
		return eseignantId;
	}

	public void setEseignantId(Integer eseignantId) {
		this.eseignantId = eseignantId;
	}

	public Integer getJuryId() {
		return juryId;
	}

	public void setJuryId(Integer juryId) {
		this.juryId = juryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eseignantId == null) ? 0 : eseignantId.hashCode());
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
		RoleJuryKey other = (RoleJuryKey) obj;
		if (eseignantId == null) {
			if (other.eseignantId != null)
				return false;
		} else if (!eseignantId.equals(other.eseignantId))
			return false;
		if (juryId == null) {
			if (other.juryId != null)
				return false;
		} else if (!juryId.equals(other.juryId))
			return false;
		return true;
	}

	public RoleJuryKey(Integer eseignantId, Integer juryId) {
		super();
		this.eseignantId = eseignantId;
		this.juryId = juryId;
	}

	public RoleJuryKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
