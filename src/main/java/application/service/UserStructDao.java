package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.DeptGen;
import application.repository.UserStructRepository;

@Service
@Primary
public class UserStructDao {
	@Autowired
   UserStructRepository userStructRep ;

	public DeptGen findDept(String username) {
		// TODO Auto-generated method stub
		return userStructRep.findDeptGen(username); 
	} 
	
   	
   	
	
}
