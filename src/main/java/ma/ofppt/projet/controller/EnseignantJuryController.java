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

import ma.ofppt.projet.entity.EnseignantJury;
import ma.ofppt.projet.service.EnseignantJuryService;

@RequestMapping("/api/enseignantJury")
@RestController
@CrossOrigin
public class EnseignantJuryController {
	@Autowired
	private EnseignantJuryService enseignantJuryService;

	@GetMapping
	public List<EnseignantJury> getAll() {
		return enseignantJuryService.getAll();
	}

	@PostMapping("/add")
	public void createEnseignantJury(@RequestBody EnseignantJury enseignantJury) {
		enseignantJuryService.create(enseignantJury);
	}

	@PutMapping("/update")
	public void updateEnseignantJury(EnseignantJury enseignantJury) {
		enseignantJuryService.update(enseignantJury);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEnseignantJury(Long id) {
		enseignantJuryService.delete(id);
	}

	public EnseignantJury findById(Long id) {
		return enseignantJuryService.findById(id);
	}
}
