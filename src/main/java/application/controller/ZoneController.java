package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categorie;
import application.model.Zone;
import application.service.Categoriedao;
import application.service.ZoneDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ZoneController {
	
	@Autowired
	ZoneDao zonedao;
	
    @RequestMapping(value = "/listzone", method = RequestMethod.GET)
	public List<Zone> getAllCategories(){
		return zonedao.findAll();
	}
    

}
