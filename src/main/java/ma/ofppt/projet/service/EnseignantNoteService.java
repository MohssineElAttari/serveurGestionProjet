package ma.ofppt.projet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.EnseignantNote;
@Service
public class EnseignantNoteService implements IDao<EnseignantNote>{

	@Override
	public List<EnseignantNote> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnseignantNote findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(EnseignantNote o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EnseignantNote o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
