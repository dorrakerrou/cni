package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Grade;
import application.model.Motcle;
import application.service.Gradedao;
import application.service.MotcleDao;
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MotCleController {
	   @Autowired
		MotcleDao motcleDao;
		
	    @RequestMapping(value = "/allMotcle", method = RequestMethod.GET)
		public List<Motcle> getAllMotcle(){
			return motcleDao.findAll();
		}
	
}
