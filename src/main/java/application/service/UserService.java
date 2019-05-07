package application.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Utilisateur;
import application.repository.UserRepository;


@Service
@Primary
public class UserService implements ICrudService<Utilisateur, String>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Utilisateur> getAll() {
		return userRepository.findAll();
	}

	@Override
	public Utilisateur add(Utilisateur user) {
		return userRepository.save(user);
	}

	@Override
	public void update(Utilisateur user) {
		userRepository.save(user);
	}

	@Override
	public void saveAll(Iterable<Utilisateur> iterable) {
		userRepository.saveAll(iterable);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Optional<Utilisateur> getOneUser(String username) {
		return userRepository.findById(username) ; 
	
	}
	
	@Override
	public List<Utilisateur> getUsersByDept(String codeDept) {
		return userRepository.findUserByDept(codeDept);
	}

	
}
