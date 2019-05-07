package application.service;

import java.util.Date;
import java.util.List;

import application.model.AvoirBudget;
import application.model.Mission;

public interface IAvoirBudget {
	public List<AvoirBudget> findAll() ; 

	public List<AvoirBudget> getbugetByyearsBydept(String codeDept);
	
	public AvoirBudget addBudget(AvoirBudget a);
	
	public List<AvoirBudget> getBudgetByType(String type_budget);
	
	public List<AvoirBudget> getBugetByDate(Date date_val);
	
	public List<AvoirBudget> getBudgetByAnnee( Date annee, String codeDept);
}
