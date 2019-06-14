package ma.ofppt.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.EnseignantJury;
import ma.ofppt.projet.repository.EnseignantJuryRepository;

@Service
public class EnseignantJuryService implements IDao<EnseignantJury> {
	@Autowired
	private EnseignantJuryRepository enseignantJuryRepository;

	@Override
	public List<EnseignantJury> getAll() {

		return enseignantJuryRepository.findAll();
	}

	@Override
	public EnseignantJury findById(Long id) {

		return enseignantJuryRepository.findById(id).get();
	}

	@Override
	public void create(EnseignantJury o) {
		enseignantJuryRepository.save(o);

	}

	@Override
	public void update(EnseignantJury o) {
		enseignantJuryRepository.saveAndFlush(o);

	}

	@Override
	public void delete(Long id) {
		enseignantJuryRepository.deleteById(id);

	}

}
