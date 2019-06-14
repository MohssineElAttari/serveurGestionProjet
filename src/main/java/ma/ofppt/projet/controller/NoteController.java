package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Note;
import ma.ofppt.projet.service.NoteService;

@RestController
@RequestMapping("/api/note")
@CrossOrigin
public class NoteController {
	@Autowired
	private NoteService noteService;

	@PutMapping("/update")
	public void updateNote(@RequestBody Note note) {
		noteService.update(note);
	}
	@PostMapping("/add")
	public void saveNote(@RequestBody Note note) {
		noteService.create(note);

	}

	@GetMapping
	public List<Note> getAllNote() {
		return noteService.getAll();
	}

	@GetMapping("/find/{id}")
	public Note findNote(@PathVariable Long id) {
		return noteService.findById(id);
	}

	@DeleteMapping("/delete")
	public void deleteNote(@PathVariable Long id) {
		noteService.delete(id);
	}

}
