package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Session;
import ma.ofppt.projet.repository.SessionRepository;




@Service
public class SessionService implements IDao<Session> {
	@Autowired
	private SessionRepository sessionRepository;
	
	//Return all Jury
	@Override
	public List<Session> getAll() {
		List<Session> sessionList = new ArrayList<>();
		sessionRepository.findAll().forEach(sessionList::add);
		return sessionList;
		/*return this.list;*/
		}

	//FindJury By it's ID	
	@Override
	public Session findById(int id) {
			Optional<Session> optionalSession = sessionRepository.findById(id);
				if(optionalSession.isPresent()) {
					return optionalSession.get();
					}
			return null;
		}
		
	//Delete Jury
	@Override
	public void delete(int id) {
		sessionRepository.deleteById(id);
		/*list.remove(id);*/
		}
	
	//Save/Create a new Jury (save id id==NULL)
	@Override
	public void create(Session session) {
		sessionRepository.save(session);
		
	}
	//Update jury
	@Override
	public void update(Session session) {
		sessionRepository.save(session);
		
	}
}
