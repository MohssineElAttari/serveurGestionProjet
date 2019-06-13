package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Projet;
import ma.ofppt.projet.service.ProjetService;

@RestController
public class ProjetController {
	@Autowired ProjetService projetService;
	
	
	@RequestMapping(value="/projet/update", method = RequestMethod.PUT )
	public void updateProjet(@RequestBody Projet projet) {
		projetService.update(projet);
	}
	
	@RequestMapping(value="/projet/save", method = {RequestMethod.POST} )
	public void saveProjet(@RequestBody Projet projet) {
		projetService.create(projet);
		
	}
	
	@RequestMapping(value="/projet/all", method= RequestMethod.GET)
	public List<Projet> getAllProjets() { 
	 	return projetService.getAll();
	}
	
	@RequestMapping(value="/projet/find/{id}", method= RequestMethod.GET)
	public Projet findProjet(@PathVariable int id) {
		return projetService.findById(id);
	}
	
	@RequestMapping(value="/projet/delete/{id}",method= RequestMethod.DELETE )
	public void deleteProjet(@PathVariable int id) {
		projetService.delete(id);
	}
		
}
