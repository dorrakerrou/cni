package application.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import application.model.Missionnaire;
import application.model.Utilisateur;
import application.repository.MissionnaireRepository;
@Service
@Primary
public class MissionnaireService implements IMissionnaire {
    @Autowired
	private MissionnaireRepository missionnaireRepository ; 
	 
    
	@Override
	public List<Missionnaire> getMissionnaires() {
		// TODO Auto-generated method stub
		return missionnaireRepository.findAll() ; 	}

	@Override
	public Missionnaire addMissionaire(Missionnaire missionaire) {
	return 	missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void updateMissionaire(Missionnaire missionaire) {
		
		
		missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void deleteteMissionaire(String cin) {
		
		Missionnaire missionaire = new Missionnaire() ; 
		missionaire.setCin(cin);
		missionnaireRepository.delete(missionaire);
	}

	public Optional<Missionnaire> getMissionnaire(String cin) {
		// TODO Auto-generated method stub
		return missionnaireRepository.getMiss(cin) ; 
	}

	@Override
	public List<Missionnaire> findMissionnaire(String codeDept) {
		// TODO Auto-generated method stub
		return missionnaireRepository.findMissionnaireByDept(codeDept);
	}

	@Override
	public List<Missionnaire> findOneMissionnaireDept(String codeDept) {
		// TODO Auto-generated method stub
		return missionnaireRepository.findMissionnaireDept(codeDept) ; 
	}
}
