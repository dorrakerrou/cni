package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.AvoirBudget;
import application.model.AvoirBudgetProjet;
import application.model.Projet;
import application.service.AvoirBudgetDao;
import application.service.AvoirBudgetProjetDao;



@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirBudgetProjetController {
	@Autowired
	private AvoirBudgetProjetDao avoirBudgetProjetDao ; 
	
	@GetMapping("/listeBudgetProjet")
	public List<AvoirBudgetProjet> getFrais() {
		return avoirBudgetProjetDao.findAll() ;  
	}
	@GetMapping("/listBudgetProjetbydept")
	public List<AvoirBudgetProjet>findbugetPByyears(@RequestParam(name="codeDept",defaultValue="") String codeDept){
		return avoirBudgetProjetDao.getbugetPBydept(codeDept);
		
	}
	
	 @PostMapping("/addBProjet")
		public AvoirBudgetProjet addBProjet(@RequestBody AvoirBudgetProjet p)
		{
			 return avoirBudgetProjetDao.addBudgetProjet(p);
		}



}
