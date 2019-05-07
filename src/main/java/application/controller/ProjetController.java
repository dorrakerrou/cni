package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import application.model.Projet;
import application.repository.ProjetRepository;
import application.service.ProjetDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProjetController {

	
	@Autowired
	ProjetDao projetdao;
	
	@Autowired
	ProjetRepository projet;
	
    @RequestMapping(value = "/listProjet", method = RequestMethod.GET)
	public List<Projet> getAllProjets(){
		return projetdao.findAll();
	}
    
    @PostMapping("/addProjet")
	public Projet addProjet(@RequestBody Projet p)
	{
		 return projetdao.addProjet(p);
	}

    @GetMapping(value="/listeProjetByDept")
	  public List<Projet> findProjet(@RequestParam(name="codeDept",defaultValue="")String codeDept)
	    {
		  return projetdao.findProjet(codeDept); 
	   }
    
    
    @RequestMapping(value = "/deleteProjet", method = RequestMethod.POST)
	public Boolean deleteProjet(@RequestBody Projet p) {
	
			if (projet.delete(p.getCodPrj(), p.getCode())==1) {
				return true;
				
			}
		
		 
			else
		
		return false;}
    
    @RequestMapping(value ="/latestProjetCode", method = RequestMethod.GET)
  
    public String findCodeProjet(@RequestParam(name="codeDept",defaultValue="")String codeDept)
    {
	  return projetdao.getLatestProjetCode(codeDept); 
   }

}
