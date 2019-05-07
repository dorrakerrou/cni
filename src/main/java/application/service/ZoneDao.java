package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Categorie;
import application.model.Zone;
import application.repository.CategorieRepository;
import application.repository.ZoneRepository;

@Service
public class ZoneDao {
	
	@Autowired
	ZoneRepository zonerepository;
	
	public List<Zone> findAll(){
		return zonerepository.findAll();
	}


}
