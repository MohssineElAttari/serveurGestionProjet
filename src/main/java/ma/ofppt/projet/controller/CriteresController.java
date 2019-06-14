package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Criteres;
import ma.ofppt.projet.service.CriteresService;


@RestController
public class CriteresController {
	@Autowired
	private CriteresService criteresService;
	
	@RequestMapping(value="/criteres/update", method = RequestMethod.PUT )
	public void updateCriteres(@RequestBody Criteres criteres) {
		criteresService.update(criteres);
	}
	
	@RequestMapping(value="/criteres/save", method = {RequestMethod.POST} )
	public void saveCriteres(@RequestBody Criteres criteres) {
		criteresService.create(criteres);
		
	}
	
	@RequestMapping(value="/criteres/all", method= RequestMethod.GET)
	public List<Criteres> getAllCriteres() { 
	 	return criteresService.getAll();
	}
	
	@RequestMapping(value="/criteres/find/{id}", method= RequestMethod.GET)
	public Criteres findCriteres(@PathVariable Long id) {
		return criteresService.findById(id);
	}
	
	@RequestMapping(value="/criteres/delete/{id}",method= RequestMethod.DELETE )
	public void deleteCriteres(@PathVariable Long id) {
		criteresService.delete(id);
	}
		
		
}

