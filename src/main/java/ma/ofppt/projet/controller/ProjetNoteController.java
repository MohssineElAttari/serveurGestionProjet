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

import ma.ofppt.projet.entity.ProjetNote;
import ma.ofppt.projet.service.ProjetNoteService;

@RequestMapping("/api/projetNote")
@RestController
@CrossOrigin
public class ProjetNoteController {

	@Autowired
	private ProjetNoteService projetNoteService;

	@GetMapping
	public List<ProjetNote> getAll() {
		return projetNoteService.getAll();
	}

	@PostMapping("/add")
	public void createProjetNote(@RequestBody ProjetNote projetNote) {
		projetNoteService.create(projetNote);
	}

	@PutMapping("/update")
	public void updateProjetNote(ProjetNote projetNote) {
		projetNoteService.update(projetNote);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProjetNote(Long id) {
		projetNoteService.delete(id);
	}

	public ProjetNote findById(Long id) {
		return projetNoteService.findById(id);
	}
}
