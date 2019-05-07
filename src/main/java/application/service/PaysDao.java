package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Missionnaire;
import application.model.Pays;
import application.repository.PaysRepository;


@Service
public class PaysDao {

	
	@Autowired
	PaysRepository paysrepository ;
	
	public List<Pays> findAll(){
		return paysrepository.findAll();
	}
	
	
	public Pays addPays(Pays pays) {
		return 	paysrepository.save(pays) ; 
			
		}

}
