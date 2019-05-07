package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categorie;
import application.model.TypFrais;
import application.service.Categoriedao;
import application.service.TypFraisDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TypFraisController {
	@Autowired
	TypFraisDao typfraisdao;
	
    @RequestMapping(value = "/listType", method = RequestMethod.GET)
	public List<TypFrais> getAllType(){
		return typfraisdao.findAll();
	}

}
