package ma.ofppt.projet.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Groupe;
import ma.ofppt.projet.service.GroupeService;
@RestController
public class GroupeController {
	@Autowired
	private GroupeService groupeS;
	
	@RequestMapping(value="/test")
	public String test() {
		return"test";
	}
	
	@RequestMapping(value="/groupe/update", method = RequestMethod.PUT )
	public void updateGroupes(@RequestBody Groupe Gr) {
		groupeS.update(Gr);
	}
	
	@RequestMapping(value="/groupe/save", method = {RequestMethod.POST, RequestMethod.GET} )
	public void saveGroupe(@RequestBody Groupe groupe) {
		groupeS.create(groupe);
		
	}
	
	@RequestMapping(value="/groupe/all", method= RequestMethod.GET)
	public List<Groupe> getAllGroupes() { 
	 	return groupeS.getAll();
	}
	
	@RequestMapping(value="/groupe/find/{id}", method= RequestMethod.GET)
	public Groupe findgroupe(@PathVariable Long id) {
		return groupeS.findById(id);
	}
	
	@RequestMapping(value="/groupe/delete/{id}",method= RequestMethod.DELETE )
	public void deleteGroupe(@PathVariable Long id) {
		groupeS.delete(id);
	}
		
		
}