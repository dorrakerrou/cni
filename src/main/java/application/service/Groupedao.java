package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Groupe;
import application.repository.GroupeRepository;


@Service
@Primary
public class Groupedao {

	
	
	@Autowired
	GroupeRepository grouperepository;
	
	public List<Groupe> findAll(){
		return grouperepository.findAll();
	}


}
