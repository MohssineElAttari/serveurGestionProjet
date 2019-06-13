package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Personne;
import ma.ofppt.projet.service.PersonneService;

@RestController
public class PersonneController {
	@Autowired
	private PersonneService personneService;
	
	
	@RequestMapping(value="/personne/update", method = RequestMethod.PUT )
	public void updatePersonne(@RequestBody Personne personne) {
		personneService.update(personne);
	}
	
	@RequestMapping(value="/personne/save", method = {RequestMethod.POST} )
	public void savePersonne(@RequestBody Personne personne) {
		personneService.create(personne);
		
	}
	
	@RequestMapping(value="/personne/all", method= RequestMethod.GET)
	public List<Personne> getAllPersonnes() { 
	 	return personneService.getAll();
	}
	
	@RequestMapping(value="/personne/find/{id}", method= RequestMethod.GET)
	public Personne findPersonne(@PathVariable int id) {
		return personneService.findById(id);
	}
	
	@RequestMapping(value="/personne/delete/{id}",method= RequestMethod.DELETE )
	public void deletePersonne(@PathVariable int id) {
		personneService.delete(id);
	}
		
}
