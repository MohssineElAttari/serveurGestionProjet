package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Note;
import ma.ofppt.projet.repository.NoteRepository;



@Service
public class NoteService implements IDao<Note> {
	@Autowired
	private NoteRepository noteRepository;
	
	//Return all Note
	@Override
	public List<Note> getAll() {
		List<Note> noteList= new ArrayList<>();
		noteRepository.findAll().forEach(noteList::add);
		return noteList;
		/*return this.list;*/
		}

	//Find Note By it's ID	
	@Override
	public Note findById(int id) {
			Optional<Note> optionalNote = noteRepository.findById((float) id);
				if(optionalNote.isPresent()) {
					return optionalNote.get();
					}
			return null;
		}
		
	//Delete Jury
	@Override
	public void delete(int id) {
		noteRepository.deleteById((float)id);
		/*list.remove(id);*/
		}
	
	//Save/Create a new Jury (save id id==NULL)
	@Override
	public void create(Note note) {
		noteRepository.save(note);
		
	}
	//Update jury
	@Override
	public void update(Note note) {
		noteRepository.save(note);
		
	}
}
