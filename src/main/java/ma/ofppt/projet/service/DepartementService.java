package ma.ofppt.projet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ofppt.projet.dao.IDao;
import ma.ofppt.projet.entity.Departement;
import ma.ofppt.projet.repository.DepartementRepository;


@Service
public class DepartementService implements IDao<Departement> {
	@Autowired
	private DepartementRepository departementRepository;
	//private List<Departement> list =new ArrayList<Departement>();  

	
	//Return all Departement
	
	@Override
	public List<Departement> getAll() {
		List<Departement> departementList = new ArrayList<>();
		departementRepository.findAll().forEach(departementList::add);
		return departementList;
		
		}

	//Find Departement By it's ID	
	@Override
	public Departement findById(int id) {
			Optional<Departement> optionalDepartement = departementRepository.findById(id);
				if(optionalDepartement.isPresent()) {
					return optionalDepartement.get();
					}
			return null;
		}
		
	//Delete Departement
	@Override
	public void delete(int id) {
		departementRepository.deleteById(id);
		
		}
	
	//Save/Create a new Departement (save id id==NULL)
	@Override
	public void create(Departement departement) {
		departementRepository.save(departement);
		
	}
	//Update Departement
	@Override
	public void update(Departement departement) {
		departementRepository.save(departement);
		
	}
}
