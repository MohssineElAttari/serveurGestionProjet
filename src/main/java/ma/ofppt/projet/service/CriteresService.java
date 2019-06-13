package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Criteres;
import ma.ofppt.projet.repository.CriteresRepository;


@Service
public class CriteresService implements IDao<Criteres>{
	@Autowired
	private CriteresRepository criteresRepository;
	//private List<Criteres> list =new ArrayList<Criteres>();  

	
	//Return all years
	@Override
	public List<Criteres> getAll() {
		List<Criteres> criteresList = new ArrayList<>();
		criteresRepository.findAll().forEach(criteresList::add);
		return criteresList;
		/*return this.list;*/
		}

	//Find year By it's ID	
	@Override
	public Criteres findById(int id) {
			Optional<Criteres> optionalCriteres = criteresRepository.findById(id);
				if(optionalCriteres.isPresent()) {
					return optionalCriteres.get();
					}
			return null;
		}
		
	//Delete Year
	@Override
	public void delete(int id) {
		criteresRepository.deleteById(id);
		}
	
	//Save/Create a new year (save id id==NULL)
	@Override
	public void create(Criteres criteres) {
		criteresRepository.save(criteres);
		
	}
	//Update year
	@Override
	public void update(Criteres criteres) {
		criteresRepository.save(criteres);
		
	}

	
	
}
