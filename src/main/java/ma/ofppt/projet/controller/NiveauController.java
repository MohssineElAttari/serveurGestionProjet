package ma.ofppt.projet.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Niveau;
import ma.ofppt.projet.service.NiveauService;



@RestController
public class NiveauController {
	@Autowired
	private NiveauService niveauService;
	
	
	@RequestMapping(value="/niveau/update", method = RequestMethod.PUT )
	public void updateNiveau(@RequestBody Niveau niveau) {
		niveauService.update(niveau);
	}
	
	@RequestMapping(value="/niveau/save", method = {RequestMethod.POST} )
	public void saveNiveau(@RequestBody Niveau niveau) {
		niveauService.create(niveau);
		
	}
	
	@RequestMapping(value="/niveau/all", method= RequestMethod.GET)
	public List<Niveau> getAllNiveau() { 
	 	return niveauService.getAll();
	}
	
	@RequestMapping(value="/niveau/find/{id}", method= RequestMethod.GET)
	public Niveau findNiveau(@PathVariable int id) {
		return niveauService.findById(id);
	}
	
	@RequestMapping(value="/niveau/delete/{id}",method= RequestMethod.DELETE )
	public void deleteNiveau(@PathVariable int id) {
		niveauService.delete(id);
	}
		
}
