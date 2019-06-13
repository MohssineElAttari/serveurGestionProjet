package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Jury;
import ma.ofppt.projet.service.JuryService;


@RestController
public class JuryConroller {
	@Autowired
	private JuryService juryService;
	
	
	@RequestMapping(value="/jury/update", method = RequestMethod.PUT )
	public void updateJury(@RequestBody Jury jury) {
		juryService.update(jury);
	}
	
	@RequestMapping(value="/jury/save", method = {RequestMethod.POST} )
	public void saveJury(@RequestBody Jury jury) {
		juryService.create(jury);
		
	}
	
	@RequestMapping(value="/jury/all", method= RequestMethod.GET)
	public List<Jury> getAllJury() { 
	 	return juryService.getAll();
	}
	
	@RequestMapping(value="/jury/find/{id}", method= RequestMethod.GET)
	public Jury findJury(@PathVariable int id) {
		return juryService.findById(id);
	}
	
	@RequestMapping(value="/jury/delete/{id}",method= RequestMethod.DELETE )
	public void deleteJury(@PathVariable int id) {
		juryService.delete(id);
	}
		
}
