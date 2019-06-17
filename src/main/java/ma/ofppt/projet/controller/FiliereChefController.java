//package ma.ofppt.projet.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import ma.ofppt.projet.entity.FiliereChef;
//import ma.ofppt.projet.service.FiliereChefService;
//
//@RestController
//@RequestMapping("/api/filiere")
//@CrossOrigin
//public class FiliereChefController {
//	@Autowired
//	private FiliereChefService filiereChefService;
//
//	@PutMapping("/update")
//	public void updateFiliereChef(@RequestBody FiliereChef filiereChef) {
//		filiereChefService.update(filiereChef);
//	}
//
//	@PostMapping("/add")
//	public void saveFiliereChef(@RequestBody FiliereChef filiereChef) {
//		filiereChefService.create(filiereChef);
//
//	}
//
//	@GetMapping
//	public List<FiliereChef> getAllFiliereChef() {
//		return filiereChefService.getAll();
//	}
//
//	@GetMapping("/find/{id}")
//	public FiliereChef findFiliereChef(@PathVariable Long id) {
//		return filiereChefService.findById(id);
//	}
//
//	@DeleteMapping("/delete")
//	public void deleteFiliereChef(@PathVariable Long id) {
//		filiereChefService.delete(id);
//	}
//
//}
