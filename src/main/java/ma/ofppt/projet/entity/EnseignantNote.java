package ma.ofppt.projet.entity;


public class EnseignantNote {
	private Long enseingnant_id;
	private Long note_id;
	
	public EnseignantNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnseignantNote(Long enseingnant_id, Long note_id) {
		super();
		this.enseingnant_id = enseingnant_id;
		this.note_id = note_id;
	}
	public Long getEnseingnant_id() {
		return enseingnant_id;
	}
	public void setEnseingnant_id(Long enseingnant_id) {
		this.enseingnant_id = enseingnant_id;
	}
	public Long getNote_id() {
		return note_id;
	}
	public void setNote_id(Long note_id) {
		this.note_id = note_id;
	}
	
	

}
