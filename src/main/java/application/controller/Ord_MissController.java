package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.Mission;
import application.model.Missionnaire;
import application.model.OrdMis;
import application.repository.Ord_MissRepository;
import application.service.Missiondao;
import application.service.Ord_MissDao;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Ord_MissController  {

	@Autowired
	Ord_MissDao ordMissDao;
	@Autowired
	Ord_MissRepository repository;

	
	@GetMapping("/getAll")
	public List<OrdMis> getOrds() {
		return ordMissDao. findAll(); 
		
	}
	
	@PostMapping("/addordMiss")
	public void addOrdMiss(@RequestBody OrdMis ordMiss)
	{
		 ordMissDao.ajouter(ordMiss);
	}
	
	@PutMapping("/updateordMiss")
	public void Modiford(@RequestBody OrdMis o) {
		ordMissDao.updateOrd(o);
		
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Boolean deleteord(@RequestBody OrdMis ord) {
	
			if (repository.delete(ord.getCode(),ord.getCin(),ord.getNumord(),ord.getNumMission())==1) {
				return true;
				
			}
		
		 
			else

		
		return false;}

	
	@GetMapping(value="/getMissionnByMision")
	  public List<OrdMis> findMissionnaire(@RequestParam(name="numMission",defaultValue="")String numMission)
	    {
		  return ordMissDao.getMissionnaireByMission(numMission) ; 
	    }
}
	
