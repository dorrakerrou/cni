package application.service;

import java.util.List;
import java.util.Optional;

import application.model.Mission;
import application.model.MissionPK;


public interface IMission {
	List<Mission> getMissions() ; 
	
	Mission addMission(Mission Mission) ; 
	
	void updateMission(Mission Mission) ; 
	
	void deleteMission(Long code) ; 
	public List<Mission> findMission(String codeDept);
	public Optional<Mission> getMissionById( String code , String numMission) ; 
	public String getLatestMissionCode(String code) ; 
}
