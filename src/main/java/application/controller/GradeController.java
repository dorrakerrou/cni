package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.Grade;
import application.service.Gradedao;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class GradeController {
	@Autowired
	Gradedao gradedao;
	
    @RequestMapping(value = "/allGrade", method = RequestMethod.GET)
	public List<Grade> getAllgrades(){
		return gradedao.findAll();
	}
	


}
