package ma.ofppt.projet.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.ofppt.projet.entity.Departement;
import ma.ofppt.projet.service.DepartementService;

public class DepartementController {
	@Autowired
	private DepartementService departementService;
	
	@RequestMapping(value="/departement/update", method = RequestMethod.PUT )
	public void updateDepartement(@RequestBody Departement departement) {
		departementService.update(departement);
	}
	
	@RequestMapping(value="/departement/save", method = {RequestMethod.POST} )
	public void saveDepartement(@RequestBody Departement departement) {
		departementService.create(departement);
		
	}
	
	@RequestMapping(value="/departement/all", method= RequestMethod.GET)
	public List<Departement> getAllDepartement() { 
	 	return departementService.getAll();
	}
	
	@RequestMapping(value="/departement/find/{id}", method= RequestMethod.GET)
	public Departement findDepartement(@PathVariable int id) {
		return departementService.findById(id);
	}
	
	@RequestMapping(value="/departement/delete/{id}",method= RequestMethod.DELETE )
	public void deleteAnnee(@PathVariable int id) {
		departementService.delete(id);
	}
		
		
}

