package application.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.Missionnaire;
import application.model.Mission;
import application.model.MissionPK;
import application.service.Missiondao;


@RestController
@RequestMapping("/api/mission")
@CrossOrigin("*")
public class MissionController {
	
	@Autowired
	Missiondao missiondao;
	
	
	@GetMapping("/listmission")
	public List<Mission> getMission() {
		return missiondao.getMissions() ; 
		
	}
	@PostMapping("/add")
	public Mission addMission(@RequestBody Mission Mission)
	{
		return missiondao.addMission(Mission);
	}
	
	@PutMapping("/update")
	public void updateMission(@RequestBody Mission missiona)
	{
		missiondao.updateMission(missiona);
		
	}
	@DeleteMapping("/{code}")
	public void deleteMission(@PathVariable Long code)
	{
		missiondao.deleteMission(code);
	}
    @RequestMapping(value = "/listeMissionByDept", method = RequestMethod.GET)
	  public List<Mission> findMission(@RequestParam(name="codeDept",defaultValue="")String codeDept)
	    {
		  return missiondao.findMission(codeDept) ; 
	   }
	

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
	  public Optional<Mission> getMissionById(@RequestBody Mission mission)
	    {
		  return missiondao.getMissionById(mission.getCode() , mission.getNumMission()) ; 
    }
	
	@GetMapping(value="/latestMissionCode")
	  public String findCodeMission(@RequestParam(name="codeDept",defaultValue="")String codeDept)
	    {
		  return missiondao.getLatestMissionCode(codeDept); 
	   }
	
	
}