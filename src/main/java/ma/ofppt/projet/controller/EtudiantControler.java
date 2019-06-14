package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Etudiant;
import ma.ofppt.projet.service.EtudiantService;

@RestController
@CrossOrigin
public class EtudiantControler {
	@Autowired
	private EtudiantService etudiantService;
	
	
	@RequestMapping(value="/etudiant/update", method = RequestMethod.PUT )
	public void updateEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.update(etudiant);
	}
	
	@RequestMapping(value="/etudiant/save", method = {RequestMethod.POST} )
	public void saveEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.create(etudiant);
		
	}
	
	@RequestMapping(value="/etudiant/all", method= RequestMethod.GET)
	public List<Etudiant> getAllEtudiant() { 
	 	return etudiantService.getAll();
	}
	
	@RequestMapping(value="/etudiant/find/{id}", method= RequestMethod.GET)
	public Etudiant findEtudiant(@PathVariable Long id) {
		return etudiantService.findById(id);
	}
	
	@RequestMapping(value="/etudiant/delete/{id}",method= RequestMethod.DELETE )
	public void deleteEtudiant(@PathVariable Long id) {
		etudiantService.delete(id);
	}
		
}
