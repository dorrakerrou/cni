package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categorie;
import application.model.Classe;
import application.service.Categoriedao;
import application.service.Classedao;



@RestController
@CrossOrigin("*")
public class ClasseController {
	@Autowired
	Classedao classeDao;
    @RequestMapping(value = "/api/allClasse", method = RequestMethod.GET)
	public List<Classe> getAllCategories(){
		return classeDao.findAll();
	}
    

}
