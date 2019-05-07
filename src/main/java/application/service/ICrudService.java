package application.service;

import java.util.List;
import java.util.Optional;

import application.model.Utilisateur;

public interface ICrudService<T, ID> {

    List<T> getAll();
	
	Utilisateur add(T entity);
	
	void update(T entity);
		
	void saveAll(Iterable<T> iterable);

	void delete(String id);
	
	//void delete(String id);
	public List<Utilisateur> getUsersByDept(String codeDept) ;
    public Optional<Utilisateur> getOneUser(String username) ;

}
