package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import application.model.TypFrais;
import application.repository.TypFraisRepository;

@Service
public class TypFraisDao {
	@Autowired
	TypFraisRepository typfraisrepository;
	
	public List<TypFrais> findAll(){
		return typfraisrepository.findAll();
	}

}
