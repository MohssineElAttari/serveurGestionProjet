package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Note;
import ma.ofppt.projet.service.NoteService;

@RestController
public class NoteController {
	@Autowired
	private NoteService noteService;
	
	
	@RequestMapping(value="/note/update", method = RequestMethod.PUT )
	public void updateNote(@RequestBody Note note) {
		noteService.update(note);
	}
	
	@RequestMapping(value="/note/save", method = {RequestMethod.POST} )
	public void saveNote(@RequestBody Note note) {
		noteService.create(note);
		
	}
	
	@RequestMapping(value="/note/all", method= RequestMethod.GET)
	public List<Note> getAllNote() { 
	 	return noteService.getAll();
	}
	
	@RequestMapping(value="/note/find/{id}", method= RequestMethod.GET)
	public Note findNote(@PathVariable int id) {
		return noteService.findById(id);
	}
	
	@RequestMapping(value="/note/delete/{id}",method= RequestMethod.DELETE )
	public void deleteNote(@PathVariable int id) {
		noteService.delete(id);
	}
		
}
