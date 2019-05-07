package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import application.model.Motcle;
import application.repository.MotCleRepository;

@Service
@Primary
public class MotcleDao {

	
		
		@Autowired
		MotCleRepository motCleRep;
		
		public List<Motcle> findAll(){
			return motCleRep.findAll();
		}

	
}
