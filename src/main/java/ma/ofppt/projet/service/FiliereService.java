package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Filiere;
import ma.ofppt.projet.repository.FiliereRepository;

@Service
public class FiliereService implements IDao<Filiere> {
	@Autowired
	private FiliereRepository filiereRepository;

	// Return all Filiere
	@Override
	public List<Filiere> getAll() {
		List<Filiere> filiereList = new ArrayList<>();
		filiereRepository.findAll();
		return filiereList;
		/* return this.list; */
	}

	// Find Filiere By it's ID
	@Override
	public Filiere findById(Long id) {

		return filiereRepository.findById(id).get();
	}

	// Delete Filiere
	@Override
	public void delete(Long id) {
		filiereRepository.deleteById(id);
		/* list.remove(id); */
	}

	// Save/Create a new Etudiant (save id id==NULL)
	@Override
	public void create(Filiere filiere) {
		filiereRepository.save(filiere);

	}

	// Update Etudiant
	@Override
	public void update(Filiere etudiant) {
		filiereRepository.save(etudiant);

	}

}
