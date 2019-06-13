package ma.ofppt.projet.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.AnneeScolaire;
import ma.ofppt.projet.service.AnneeScolaireService;

@RestController

public class AnneeScolaireController {
	
		
		@Autowired
		private AnneeScolaireService anneeScolaireService;
		
		@RequestMapping(value="/anneescolaire/update", method = RequestMethod.PUT )
		public void updateAnnee(@RequestBody AnneeScolaire anneeScolaire) {
			anneeScolaireService.update(anneeScolaire);
		}
		
		@RequestMapping(value="/anneescolaire/save", method = {RequestMethod.POST} )
		public void saveAnnee(@RequestBody AnneeScolaire anneeScolaire) {
			anneeScolaireService.create(anneeScolaire);
			
		}
		
		@RequestMapping(value="/anneescolaire/all", method= RequestMethod.GET)
		public List<AnneeScolaire> getAllAnnee() { 
		 	return anneeScolaireService.getAll();
		}
		
		@RequestMapping(value="/anneescolaire/find/{id}", method= RequestMethod.GET)
		public AnneeScolaire findAnnee(@PathVariable int id) {
			return anneeScolaireService.findById(id);
		}
		
		@RequestMapping(value="/anneescolaire/delete/{id}",method= RequestMethod.DELETE )
		public void deleteAnnee(@PathVariable int id) {
			anneeScolaireService.delete(id);
		}
			
			
	}


