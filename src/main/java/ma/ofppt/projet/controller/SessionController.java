package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Session;
import ma.ofppt.projet.service.SessionService;

@RestController
@RequestMapping("api/session")
@CrossOrigin
public class SessionController {
	@Autowired
	private SessionService sessionService;

	@PutMapping("/update")
	public void updateSession(@RequestBody Session session) {
		sessionService.update(session);
	}

	@PostMapping("/add")
	public void saveSession(@RequestBody Session session) {
		sessionService.create(session);

	}

	@GetMapping
	public List<Session> getAllSession() {
		return sessionService.getAll();
	}

	@GetMapping("/find/{id}")
	public Session findSession(@PathVariable Long id) {
		return sessionService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteSession(@PathVariable Long id) {
		sessionService.delete(id);
	}

}
