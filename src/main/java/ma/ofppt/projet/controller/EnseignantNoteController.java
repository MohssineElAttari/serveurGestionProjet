package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.EnseignantNote;
import ma.ofppt.projet.service.EnseignantNoteService;

@RequestMapping("/api/enseignantNote")
@RestController
@CrossOrigin
public class EnseignantNoteController {
	@Autowired
	private EnseignantNoteService enseignantNoteService;

	@GetMapping
	public List<EnseignantNote> getAll() {
		return enseignantNoteService.getAll();
	}

	@PostMapping("/add")
	public void createEnseignantNote(@RequestBody EnseignantNote enseignantNote) {
		enseignantNoteService.create(enseignantNote);
	}

	@PutMapping("/update")
	public void updateEnseignantNote(EnseignantNote enseignantNote) {
		enseignantNoteService.update(enseignantNote);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEnseignantNote(Long id) {
		enseignantNoteService.delete(id);
	}

	public EnseignantNote findById(Long id) {
		return enseignantNoteService.findById(id);
	}
}
