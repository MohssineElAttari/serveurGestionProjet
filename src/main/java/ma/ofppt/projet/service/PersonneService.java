package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Personne;
import ma.ofppt.projet.repository.PersonneRepository;

@Service
public class PersonneService implements IDao<Personne> {
	@Autowired
	private PersonneRepository personneRepository;

	// Return all Personne
	@Override
	public List<Personne> getAll() {
		List<Personne> personneList = new ArrayList<>();
		return personneRepository.findAll();
		/* return this.list; */
	}

	// Find Personne By it's ID
	@Override
	public Personne findById(Long id) {
		return personneRepository.findById(id).get();

	}

	// Delete Personne
	@Override
	public void delete(Long id) {
		personneRepository.deleteById(id);
		/* list.remove(id); */
	}

	// Save/Create a new Personne (save id id==NULL)
	@Override
	public void create(Personne personne) {
		personneRepository.save(personne);

	}

	// Update Personne
	@Override
	public void update(Personne personne) {
		personneRepository.save(personne);

	}

}
