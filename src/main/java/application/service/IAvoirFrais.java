package application.service;

import java.util.List;

import application.model.AvoirFrais;
import application.model.Mission;

public interface IAvoirFrais {

	List<AvoirFrais> getFrais() ; 
	
	 AvoirFrais addFrais(AvoirFrais frais);
	
	void updateFrais(AvoirFrais frais) ; 
	
	void deleteFrais(AvoirFrais frais) ; 
	
	public List<AvoirFrais> AvoirFraisByMission(String numMission) ;

}
