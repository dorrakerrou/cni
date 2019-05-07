package application.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.AvoirBudget;
import application.model.Classe;
import application.model.Mission;
import application.repository.AvoirBudgetRepository;
import application.repository.ClasseRepository;
@Service
@Primary
public class AvoirBudgetDao implements IAvoirBudget{

	@Autowired
	AvoirBudgetRepository avoirBudgetRepository;
	
	@Override
	public List<AvoirBudget> findAll(){
		return avoirBudgetRepository.findAll();
	}

	@Override
	public List<AvoirBudget> getbugetByyearsBydept(String code) {
		return avoirBudgetRepository.findBugetByDeptByYears(code);
	}

	

	@Override
	public List<AvoirBudget> getBudgetByType(String type_budget) {
		// TODO Auto-generated method stub
		return avoirBudgetRepository.getAvoirBudgetByType(type_budget);
	}

	@Override
	public List<AvoirBudget> getBugetByDate(Date date_val) {
		// TODO Auto-generated method stub
		return avoirBudgetRepository.getBudgetByDate(date_val);
	}

	@Override
	public AvoirBudget addBudget(AvoirBudget a) {
		return 	avoirBudgetRepository.save(a) ; 
	}

	@Override
	public List<AvoirBudget> getBudgetByAnnee( Date annee, String code) {
		// TODO Auto-generated method stub
		return avoirBudgetRepository.getBudgetByDeptByAnnee( annee, code);
	}
	
	

	
}
