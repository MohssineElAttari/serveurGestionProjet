package ma.ofppt.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.ProjetNote;
import ma.ofppt.projet.repository.ProjetNoteRepository;
@Service
public class ProjetNoteService implements IDao<ProjetNote>{
	@Autowired
	private ProjetNoteRepository projetNoteRepository;
	@Override
	public List<ProjetNote> getAll() {
		
		return projetNoteRepository.findAll();
	}

	@Override
	public ProjetNote findById(Long id) {
		
		return projetNoteRepository.findById(id).get();
	}

	@Override
	public void create(ProjetNote o) {
		projetNoteRepository.save(o);
		
	}

	@Override
	public void update(ProjetNote o) {
		projetNoteRepository.saveAndFlush(o);
		
	}

	@Override
	public void delete(Long id) {
		projetNoteRepository.deleteById(id);
		
	}

}
