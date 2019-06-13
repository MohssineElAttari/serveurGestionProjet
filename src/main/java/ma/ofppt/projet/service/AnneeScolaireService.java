package ma.ofppt.projet.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.AnneeScolaire;
import ma.ofppt.projet.repository.AnneeScolaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnneeScolaireService implements IDao<AnneeScolaire> {

		@Autowired
		private AnneeScolaireRepository anneeScolaireRepository;
		//private List<AnneeScolaire> list =new ArrayList<AnneeScolaire>();  

		
		//Return all years
		@Override
		public List<AnneeScolaire> getAll() {
			List<AnneeScolaire> anneeScolaireList = new ArrayList<>();
			anneeScolaireRepository.findAll().forEach(anneeScolaireList::add);
			return anneeScolaireList;
			/*return this.list;*/
			}

		//Find year By it's ID	
		@Override
		public AnneeScolaire findById(int id) {
				Optional<AnneeScolaire> optionalAnneeScolaire = anneeScolaireRepository.findById(id);
					if(optionalAnneeScolaire.isPresent()) {
						return optionalAnneeScolaire.get();
						}
				return null;
			}
			
		//Delete Year
		@Override
		public void delete(int id) {
			anneeScolaireRepository.deleteById(id);
			/*list.remove(id);*/
			}
		
		//Save/Create a new year (save id id==NULL)
		@Override
		public void create(AnneeScolaire anneeScolaire) {
			anneeScolaireRepository.save(anneeScolaire);
			
		}
		//Update year
		@Override
		public void update(AnneeScolaire anneeScolaire) {
			anneeScolaireRepository.save(anneeScolaire);
			
		}

		
		
	}
		



