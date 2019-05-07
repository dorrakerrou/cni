package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Mission;
import application.model.MissionPK;
import application.repository.MissionRepository;

@Service
@Primary
public class Missiondao implements IMission {
	   
		@Autowired
		private MissionRepository missionRepository ; 
		 
		@Override
		public List<Mission> getMissions() {
			// TODO Auto-generated method stub
			return missionRepository.findAll() ; 	}

		@Override
		public Mission addMission(Mission Mission) {
			return missionRepository.save(Mission) ; 
			
		}

		@Override
		public void updateMission(Mission Mission) {
			
			
			missionRepository.save(Mission) ; 
			
		}

		@Override
		public void deleteMission(Long code) {
			
			Mission Mission = new Mission() ; 
			//Mission.setCode_mission(code);
			missionRepository.delete(Mission);
		}
	/*	@Override
		public List<Mission> findMission(String codeDept) {
			// TODO Auto-generated method stub
			return missionRepository.findMissionByDept(codeDept) ; 
		}

	  
		@Override
		public Optional<Mission> getMissionById(String code ,String num ) {
			return missionRepository.recherche(code , num);
		}*/

		@Override
		public List<Mission> findMission(String codeDept) {
			// TODO Auto-generated method stub
			return missionRepository.findMissionByDept(codeDept) ; 
		}

		@Override
		public Optional<Mission> getMissionById(String code, String numMission) {
			// TODO Auto-generated method stub
			return missionRepository.recherche(code , numMission);
		}

		@Override
		public String getLatestMissionCode(String code) {
			
			return missionRepository.LatestMissionCode(code) ; 
		}

	}
