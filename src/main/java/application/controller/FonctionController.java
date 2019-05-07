package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Fonction;
import application.model.Missionnaire;
import application.service.Fonctiondao;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class FonctionController {
	@Autowired
	Fonctiondao fonctiondao;
	
	@GetMapping("/listfonction")
	public List<Fonction> getAllfonction(){
		return fonctiondao.findAll();
	}
	@PostMapping("/addFonction")
	public void addfonct(@RequestBody Fonction missionaire)
	{
		fonctiondao.addfonct(missionaire);
	}
	


}
