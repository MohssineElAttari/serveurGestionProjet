package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Enseignant;
import ma.ofppt.projet.repository.EnseignantRepository;

@Service
public class EnseignantService implements IDao<Enseignant>{
	@Autowired
	private EnseignantRepository enseignantRepository;
	
	//Return all Enseignant
	@Override
	public List<Enseignant> getAll() {
		List<Enseignant> enseignantList = new ArrayList<>();
		enseignantRepository.findAll().forEach(enseignantList::add);
		return enseignantList;
		/*return this.list;*/
		}

	//Find Enseignant By it's ID	
	@Override
	public Enseignant findById(int id) {
			Optional<Enseignant> optionalEnseignant = enseignantRepository.findById(id);
				if(optionalEnseignant.isPresent()) {
					return optionalEnseignant.get();
					}
			return null;
		}
		
	//Delete Enseignant
	@Override
	public void delete(int id) {
		enseignantRepository.deleteById(id);
		/*list.remove(id);*/
		}
	
	//Save/Create a new Jury (save id id==NULL)
	@Override
	public void create(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
		
	}
	//Update jury
	@Override
	public void update(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
		
	}


}
