package ma.ofppt.projet.dao;

import java.util.List;

public interface IDao<T> {
	public List<T> getAll();
	public T findById(Long id);
	public void create(T o);
	public void update(T o);
	public void delete(Long id);
	


 }
