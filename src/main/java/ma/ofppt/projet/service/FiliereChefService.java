//package ma.ofppt.projet.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ma.ofppt.projet.dao.IDao;
//import ma.ofppt.projet.entity.FiliereChef;
//import ma.ofppt.projet.repository.FiliereChefRepository;
//
//@Service
//public class FiliereChefService implements IDao<FiliereChef> {
//	@Autowired
//	private FiliereChefRepository filiereChefRepository;
//
//	@Override
//	public List<FiliereChef> getAll() {
//		return filiereChefRepository.findAll();
//	}
//
//	@Override
//	public FiliereChef findById(Long id) {
//
//		return filiereChefRepository.findById(id).get();
//	}
//
//	@Override
//	public void create(FiliereChef o) {
//		filiereChefRepository.save(o);
//	}
//
//	@Override
//	public void update(FiliereChef o) {
//		filiereChefRepository.saveAndFlush(o);
//
//	}
//
//	@Override
//	public void delete(Long id) {
//		filiereChefRepository.deleteById(id);
//
//	}
//
//}
