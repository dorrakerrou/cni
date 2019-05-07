package application.service;

import java.util.List;

import application.model.AvoirBudget;
import application.model.AvoirBudgetProjet;

public interface IAvoirBudgetProjet {
	public List<AvoirBudgetProjet> findAll() ; 
	public AvoirBudgetProjet addBudgetProjet(AvoirBudgetProjet a) ;
}
