//package ma.ofppt.projet.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ma.ofppt.projet.dao.IDao;
//import ma.ofppt.projet.entity.DepartementChef;
//import ma.ofppt.projet.repository.DepartementChefRepository;
//
//@Service
//public class DepartementChefService implements IDao<DepartementChef> {
//	@Autowired
//	private DepartementChefRepository departementChefRepostory;
//
//	@Override
//	public List<DepartementChef> getAll() {
//
//		return departementChefRepostory.findAll();
//	}
//
//	@Override
//	public DepartementChef findById(Long id) {
//		return departementChefRepostory.findById(id).get();
//	}
//
//	@Override
//	public void create(DepartementChef o) {
//		departementChefRepostory.save(o);
//
//	}
//
//	@Override
//	public void update(DepartementChef o) {
//		departementChefRepostory.saveAndFlush(o);
//
//	}
//
//	@Override
//	public void delete(Long id) {
//		departementChefRepostory.deleteById(id);
//
//	}
//
//}
