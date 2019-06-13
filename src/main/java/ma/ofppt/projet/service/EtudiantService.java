package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Etudiant;
import ma.ofppt.projet.repository.EtudiantRepository;

@Service
public class EtudiantService implements IDao<Etudiant> {
	@Autowired
	private EtudiantRepository etudiantRepository;

	// Return all Etudiant
	@Override
	public List<Etudiant> getAll() {
		List<Etudiant> etudiantList = new ArrayList<>();
		return etudiantRepository.findAll();
		/* return this.list; */
	}

	// Find Etudiant By it's ID
	@Override
	public Etudiant findById(Long id) {
		return etudiantRepository.findById(id).get();
	}

	// Delete Etudiant
	@Override
	public void delete(Long id) {
		etudiantRepository.deleteById(id);
		/* list.remove(id); */
	}

	// Save/Create a new Etudiant (save id id==NULL)
	@Override
	public void create(Etudiant etudiant) {
		etudiantRepository.save(etudiant);

	}

	// Update Etudiant
	@Override
	public void update(Etudiant etudiant) {
		etudiantRepository.save(etudiant);

	}

}
