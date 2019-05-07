package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Categorie;
import application.repository.CategorieRepository;


@Service
public class Categoriedao {
	
	@Autowired
	CategorieRepository categorierepository;
	
	public List<Categorie> findAll(){
		return categorierepository.findAll();
	}

}
