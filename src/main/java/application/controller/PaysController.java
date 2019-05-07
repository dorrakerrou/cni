package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Missionnaire;
import application.model.Pays;
import application.service.PaysDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PaysController {
	
	@Autowired
	PaysDao paysdao;
	
    @RequestMapping(value = "/listPays", method = RequestMethod.GET)
	public List<Pays> getAllPays(){
		return paysdao.findAll();
	}
    
    @PostMapping("/addPays")
	public Pays addPays(@RequestBody Pays pays)
	{
		 return paysdao.addPays(pays);
	}

}
