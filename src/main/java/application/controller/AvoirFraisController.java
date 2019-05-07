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

import application.model.AvoirFrais;
import application.model.Missionnaire;
import application.model.Pays;
import application.service.AvoirFraisDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirFraisController {

	@Autowired
	private AvoirFraisDao avoirFrais ; 
		
	@GetMapping("/listeFrais")
	public List<AvoirFrais> getFrais() {
		return avoirFrais.getFrais() ;  
	}
	
	
	   @PostMapping("/addFrais")
		public AvoirFrais addFraiis(@RequestBody AvoirFrais frais)
		{
			 return avoirFrais.addFrais(frais);
		}
	
	@PutMapping("/updateFrais")
	public void updateFrais(@RequestBody AvoirFrais frais) {
		avoirFrais.updateFrais(frais);
		
	}
	
	@DeleteMapping("/delete")
    public void deleteFrais(@RequestBody AvoirFrais frais) {		
	}
	

	@GetMapping(value="/avoirfraisbymission")
	public List<AvoirFrais> AvoirFraisMiss(@RequestParam(name="num",defaultValue="")String num)
	    {
		  return avoirFrais.AvoirFraisByMission(num) ; 
	    }

	
}
