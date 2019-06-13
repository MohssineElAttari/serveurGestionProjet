package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Projet;
import ma.ofppt.projet.repository.ProjetRepository;

@Service
public class ProjetService implements IDao<Projet>{
	@Autowired ProjetRepository projetRepository;
		@Override
		public List<Projet> getAll() {
			List<Projet> projetList = new ArrayList<>();
			projetRepository.findAll().forEach(projetList::add);
			return projetList;
		}

		@Override
		public Projet findById(int id) {
			Optional<Projet> optionalProjet = projetRepository.findById(id);
			if(optionalProjet.isPresent()) {
				return optionalProjet.get();
				}
		return null;
		}

		@Override
		public void create(Projet projet) {
			projetRepository.save(projet);
		}

		@Override
		public void update(Projet projet) {
			projetRepository.save(projet);
		
		}
		
		@Override
		public void delete(int id) {
			projetRepository.deleteById(id);
		
		}

}
