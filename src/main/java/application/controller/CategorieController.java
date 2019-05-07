package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categorie;
import application.service.Categoriedao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CategorieController {
	@Autowired
	Categoriedao categoriedao;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Categorie> getAllCategories(){
		return categoriedao.findAll();
	}
    
}
