package ma.ofppt.projet.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Niveau;
import ma.ofppt.projet.repository.NiveauRepository;


@Service
public class NiveauService implements IDao<Niveau>{
	@Autowired
	private NiveauRepository niveauRepository;
	
	//Return all Niveau
	@Override
	public List<Niveau> getAll() {
		List<Niveau> niveauList = new ArrayList<>();
		niveauRepository.findAll().forEach(niveauList::add);
		return niveauList;
		/*return this.list;*/
		}

	//Find Niveau By it's ID	
	@Override
	public Niveau findById(int id) {
			Optional<Niveau> optionalNiveau = niveauRepository.findById(id);
				if(optionalNiveau.isPresent()) {
					return optionalNiveau.get();
					}
			return null;
		}
		
	//Delete niveau
	@Override
	public void delete(int id) {
		niveauRepository.deleteById(id);
		/*list.remove(id);*/
		}
	
	//Save/Create a new niveau(save id id==NULL)
	@Override
	public void create(Niveau niveau) {
		niveauRepository.save(niveau);
		
	}
	//Update niveau
	@Override
	public void update(Niveau niveau) {
		niveauRepository.save(niveau);
		
	}

}
