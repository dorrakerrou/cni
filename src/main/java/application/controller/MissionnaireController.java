package application.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.DeptGen;
import application.model.Missionnaire;
import application.service.MissionnaireService;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MissionnaireController {
	
	@Autowired
	private MissionnaireService missionaireService ; 
	
	@GetMapping(value="/getOneMiss")
	  public Optional<Missionnaire> getMiss(@RequestParam(name="cin",defaultValue="")String cin)
	    {
		  return missionaireService.getMissionnaire(cin) ; 
	    }
		
	@GetMapping("/missionaire")
	public List<Missionnaire> getMissionaires() {
		return missionaireService.getMissionnaires() ; 
		
	}
	
	@PostMapping("/add")
	public Missionnaire addMissionaire(@RequestBody Missionnaire missionaire)
	{
		 return missionaireService.addMissionaire(missionaire);
	}
	
	@PutMapping
	public void updateMissionaire(@RequestBody Missionnaire missionaire)
	{
		missionaireService.updateMissionaire(missionaire);
		
	}
	@DeleteMapping("/{cin}")
	public void deleteMissionaire(@PathVariable String cin)
	{
		missionaireService.deleteteMissionaire(cin);
	}
	
	

	@GetMapping(value="/listeMissionnaireByDept")
	  public List<Missionnaire> findMissionnaire(@RequestParam(name="codeDept",defaultValue="")String codeDept)
	    {
		  return missionaireService.findMissionnaire(codeDept) ; 
	   }
		
	@PostMapping(value="/listMissDept")
	public List<Missionnaire> findOnMissionnaireDept(@RequestBody DeptGen deptgen) {
	
	return missionaireService.findOneMissionnaireDept(deptgen.getCode()) ; 
	}
	
	
	
}
