package ma.ofppt.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ofppt.projet.entity.Session;
import ma.ofppt.projet.service.SessionService;


@RestController
public class SessionController {
	@Autowired
	private SessionService sessionService;
	
	
	@RequestMapping(value="/session/update", method = RequestMethod.PUT )
	public void updateSession(@RequestBody Session session) {
		sessionService.update(session);
	}
	
	@RequestMapping(value="/session/save", method = {RequestMethod.POST} )
	public void saveSession(@RequestBody Session session) {
		sessionService.create(session);
		
	}
	
	@RequestMapping(value="/session/all", method= RequestMethod.GET)
	public List<Session> getAllSession() { 
	 	return sessionService.getAll();
	}
	
	@RequestMapping(value="/session/find/{id}", method= RequestMethod.GET)
	public Session findSession(@PathVariable int id) {
		return sessionService.findById(id);
	}
	
	@RequestMapping(value="/session/delete/{id}",method= RequestMethod.DELETE )
	public void deleteSession(@PathVariable int id) {
		sessionService.delete(id);
	}
		
}
