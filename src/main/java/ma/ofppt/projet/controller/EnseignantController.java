package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Enseignant;
import ma.ofppt.projet.service.EnseignantService;


@RestController
public class EnseignantController {
	@Autowired
	private EnseignantService enseignantService;
	
	
	@RequestMapping(value="/enseignant/update", method = RequestMethod.PUT )
	public void updateEnseignant(@RequestBody Enseignant enseignant) {
		enseignantService.update(enseignant);
	}
	
	@RequestMapping(value="/enseignant/save", method = {RequestMethod.POST} )
	public void saveEnseignant(@RequestBody Enseignant enseignant) {
		enseignantService.create(enseignant);
		
	}
	
	@RequestMapping(value="/enseignant/all", method= RequestMethod.GET)
	public List<Enseignant> getAllEnseignant() { 
	 	return enseignantService.getAll();
	}
	
	@RequestMapping(value="/enseignant/find/{id}", method= RequestMethod.GET)
	public Enseignant findEnseignant(@PathVariable Long id) {
		return enseignantService.findById(id);
	}
	
	@RequestMapping(value="/enseignant/delete/{id}",method= RequestMethod.DELETE )
	public void deleteEnseignant(@PathVariable Long id) {
		enseignantService.delete(id);
	}
		
}
