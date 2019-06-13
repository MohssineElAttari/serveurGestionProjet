package ma.ofppt.projet.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Groupe;
import ma.ofppt.projet.repository.GroupeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupeService implements IDao<Groupe> {
	@Autowired
	private GroupeRepository groupeRepository;
	// private List<Groupe> list =new ArrayList<Groupe>();

	// Return all Groups
	@Override
	public List<Groupe> getAll() {
		List<Groupe> groupeList = new ArrayList<>();
		groupeRepository.findAll();
		return groupeList;
		/* return this.list; */
	}

	// Find Group By it's ID
	@Override
	public Groupe findById(Long id) {
		return groupeRepository.findById(id).get();
	}

	// Update Group (save if id!=NULL)
	@Override
	public void update(Groupe groupe) {
		groupeRepository.save(groupe);

		/*
		 * for(Groupe g : list) { if(g.getId() == groupe.getId()){
		 * g.setCode(groupe.getCode()); g.setLibelle(groupe.getLibelle());
		 * g.setFilliere(groupe.getFilliere()); }
		 * 
		 * }
		 */
	}

	// Delete Group
	@Override
	public void delete(Long id) {
		groupeRepository.deleteById(id);
		/* list.remove(id); */
	}

	// Save/Create a new Groupe (save id id==NULL)
	public void create(Groupe groupe) {
		groupeRepository.save(groupe);
		/* this.list.add(groupe); */
	}

}
