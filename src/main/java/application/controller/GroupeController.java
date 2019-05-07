package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Groupe;
import application.service.Groupedao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class GroupeController {
	
	@Autowired
	Groupedao groupedao;
	
	@GetMapping("/listgroupe")
	public List<Groupe> getAllgroupes(){
		return groupedao.findAll();
	}


}
