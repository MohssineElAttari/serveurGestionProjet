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

import ma.ofppt.projet.entity.Niveau;
import ma.ofppt.projet.service.NiveauService;



@RestController
@RequestMapping("/api/niveau")
@CrossOrigin
public class NiveauController {
	@Autowired
	private NiveauService niveauService;
	
	@PutMapping("/update")
	public void updateNiveau(@RequestBody Niveau niveau) {
		niveauService.update(niveau);
	}
	
	@PostMapping("/add")
	public void saveNiveau(@RequestBody Niveau niveau) {
		niveauService.create(niveau);
		
	}
	
	@GetMapping
	public List<Niveau> getAllNiveau() { 
	 	return niveauService.getAll();
	}
	
	@GetMapping("/find/{id}")
	public Niveau findNiveau(@PathVariable Long id) {
		return niveauService.findById(id);
	}
	
	@DeleteMapping("/delete")
	public void deleteNiveau(@PathVariable Long id) {
		niveauService.delete(id);
	}
		
}
