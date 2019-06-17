//package ma.ofppt.projet.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import ma.ofppt.projet.entity.Filiere;
//import ma.ofppt.projet.service.FiliereService;
//
//
//
//@RestController
//public class FiliereController {
//	@Autowired
//	private FiliereService filiereService;
//	
//	
//	@RequestMapping(value="/filiere/update", method = RequestMethod.PUT )
//	public void updateFiliere(@RequestBody Filiere filiere) {
//		filiereService.update(filiere);
//	}
//	
//	@RequestMapping(value="/filiere/save", method = {RequestMethod.POST} )
//	public void saveFiliere(@RequestBody Filiere filiere) {
//		filiereService.create(filiere);
//		
//	}
//	
//	@RequestMapping(value="/filiere/all", method= RequestMethod.GET)
//	public List<Filiere> getAllFiliere() { 
//	 	return filiereService.getAll();
//	}
//	
//	@RequestMapping(value="/filiere/find/{id}", method= RequestMethod.GET)
//	public Filiere findFiliere(@PathVariable Long id) {
//		return filiereService.findById(id);
//	}
//	
//	@RequestMapping(value="/filiere/delete/{id}",method= RequestMethod.DELETE )
//	public void deleteFiliere(@PathVariable Long id) {
//		filiereService.delete(id);
//	}
//		
//}
