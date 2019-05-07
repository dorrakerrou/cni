package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Missionnaire;
import application.model.Projet;
import application.repository.ProjetRepository;

@Service
public class ProjetDao {
	

	@Autowired
	ProjetRepository projetrepository;
	
	public List<Projet> findAll(){
		return projetrepository.findAll();
	}
	
	
	public Projet addProjet(Projet p) {
		return 	projetrepository.save(p) ; 
			
		}
	
	public List<Projet> findProjet(String codeDept) {
		// TODO Auto-generated method stub
		return projetrepository.findProjetByDept(codeDept);
	}


	public String getLatestProjetCode(String codeDept) {
		// TODO Auto-generated method stub
		return projetrepository.LatestProjetCode(codeDept) ;
	}

    
}
