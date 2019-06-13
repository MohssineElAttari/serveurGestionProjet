package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Jury;
import ma.ofppt.projet.repository.JuryRepository;



@Service
public class JuryService implements IDao<Jury> {
	@Autowired
	private JuryRepository juryRepository;
	
	//Return all Jury
	@Override
	public List<Jury> getAll() {
		List<Jury> juryList = new ArrayList<>();
		juryRepository.findAll().forEach(juryList::add);
		return juryList;
		/*return this.list;*/
		}

	//FindJury By it's ID	
	@Override
	public Jury findById(int id) {
			Optional<Jury> optionalJury = juryRepository.findById(id);
				if(optionalJury.isPresent()) {
					return optionalJury.get();
					}
			return null;
		}
		
	//Delete Jury
	@Override
	public void delete(int id) {
		juryRepository.deleteById(id);
		/*list.remove(id);*/
		}
	
	//Save/Create a new Jury (save id id==NULL)
	@Override
	public void create(Jury jury) {
		juryRepository.save(jury);
		
	}
	//Update jury
	@Override
	public void update(Jury jury) {
		juryRepository.save(jury);
		
	}
}
