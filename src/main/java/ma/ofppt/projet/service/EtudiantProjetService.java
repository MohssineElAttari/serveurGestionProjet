package ma.ofppt.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.EtudiantProjet;
import ma.ofppt.projet.repository.EtudiantProjetRepository;
import ma.ofppt.projet.repository.EtudiantRepository;

@Service
public class EtudiantProjetService implements IDao<EtudiantProjet> {
	@Autowired
	private EtudiantProjetRepository etudiantProjetRepository;

	@Override
	public List<EtudiantProjet> getAll() {
		
		return etudiantProjetRepository.findAll();
	}

	@Override
	public EtudiantProjet findById(Long id) {
		
		return etudiantProjetRepository.findById(id).get();
	}

	@Override
	public void create(EtudiantProjet o) {
		etudiantProjetRepository.save(o);

	}

	@Override
	public void update(EtudiantProjet o) {
		etudiantProjetRepository.saveAndFlush(o);

	}

	@Override
	public void delete(Long id) {
		etudiantProjetRepository.deleteById(id);

	}

}
