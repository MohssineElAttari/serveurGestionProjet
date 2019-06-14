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

import ma.ofppt.projet.entity.Personne;
import ma.ofppt.projet.service.PersonneService;

@RestController
@RequestMapping("/api/personne")
@CrossOrigin
public class PersonneController {
	@Autowired
	private PersonneService personneService;

	@PutMapping("/update")
	public void updatePersonne(@RequestBody Personne personne) {
		personneService.update(personne);
	}

	@PostMapping("/add")
	public void savePersonne(@RequestBody Personne personne) {
		personneService.create(personne);

	}

	@GetMapping
	public List<Personne> getAllPersonnes() {
		return personneService.getAll();
	}

	@GetMapping("/find/{id}")
	public Personne findPersonne(@PathVariable Long id) {
		return personneService.findById(id);
	}

	@DeleteMapping("/deelete")
	public void deletePersonne(@PathVariable Long id) {
		personneService.delete(id);
	}

}
