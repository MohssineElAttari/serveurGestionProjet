//package ma.ofppt.projet.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import ma.ofppt.projet.entity.DepartementChef;
//import ma.ofppt.projet.service.DepartementChefService;
//
//@RequestMapping("/api/departementChef")
//@RestController
//@CrossOrigin
//public class DepartementChefController {
//	@Autowired
//	private DepartementChefService departementChefService;
//
//	@GetMapping
//	public List<DepartementChef> getAll() {
//		return departementChefService.getAll();
//	}
//
//	@PostMapping("/add")
//	public void createDepartementChef(@RequestBody DepartementChef departementChef) {
//		departementChefService.create(departementChef);
//	}
//
//	@PutMapping("/update")
//	public void updateDepartementChef(DepartementChef departementChef) {
//		departementChefService.update(departementChef);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public void deleteDepartementChef(Long id) {
//		departementChefService.delete(id);
//	}
//
//	public DepartementChef findById(Long id) {
//		return departementChefService.findById(id);
//	}
//}
