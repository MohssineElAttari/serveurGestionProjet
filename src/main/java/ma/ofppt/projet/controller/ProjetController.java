package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Projet;
import ma.ofppt.projet.service.ProjetService;

@RestController
@RequestMapping("/api/projet")
public class ProjetController {
	@Autowired
	ProjetService projetService;

	@PutMapping("/update")
	public void updateProjet(@RequestBody Projet projet) {
		projetService.update(projet);
	}

	@PostMapping("/add{id}")
	public void saveProjet(@RequestBody Projet projet) {
		projetService.create(projet);

	}

	@GetMapping
	public List<Projet> getAllProjets() {
		return projetService.getAll();
	}

	@GetMapping("/find/{id}")
	public Projet findProjet(@PathVariable Long id) {
		return projetService.findById(id);
	}

	@DeleteMapping("/delete")
	public void deleteProjet(@PathVariable Long id) {
		projetService.delete(id);
	}

}
