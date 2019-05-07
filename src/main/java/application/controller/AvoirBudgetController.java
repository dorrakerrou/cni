package application.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.AvoirBudget;
import application.model.AvoirFrais;
import application.model.Projet;
import application.service.AvoirBudgetDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirBudgetController {
	@Autowired
	private AvoirBudgetDao avoirBudgetDao ; 
	
	
	@GetMapping("/listeBudget")
	public List<AvoirBudget> getFrais() {
		return avoirBudgetDao.findAll() ;  
	}
	
	
	@GetMapping("/listbyDept")
	public List<AvoirBudget> findbugetByyearsBydept(@RequestParam(name="codeDept",defaultValue="") String codeDept){
		return avoirBudgetDao.getbugetByyearsBydept(codeDept);
		
	}
	
	  @PostMapping("/addBudget")
		public AvoirBudget addbudget(@RequestBody AvoirBudget p)
		{
			 return avoirBudgetDao.addBudget(p);
		}
	
	@GetMapping("/budgetbytype")
	public List<AvoirBudget> findBudget(@RequestParam(name="type_budget",defaultValue="")String type_budget){
		return avoirBudgetDao.getBudgetByType(type_budget);
	}
	
	@GetMapping("/budgetbydate")
	public List<AvoirBudget> getbudgetbyDate(@RequestParam(name="date_val",defaultValue="")Date date_val){
		return avoirBudgetDao.getBugetByDate(date_val);
	}
	
	
	//@GetMapping("/budgetbyannee")
    @RequestMapping(value = "/budgetbyannee", method = RequestMethod.POST)
	public List<AvoirBudget> getBudgetByannee(@RequestBody AvoirBudget avoirbudget ){
		return avoirBudgetDao.getBudgetByAnnee( avoirbudget.getAnnee(), avoirbudget.getCode());
	}
}
