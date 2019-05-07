package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.DeptGen;
import application.model.Mission;
import application.service.UserStructDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserStructController {
	@Autowired
	private UserStructDao userStructDao ; 
	
	@GetMapping(value="/DeptOfUsername")
	  public DeptGen findDeptgent(@RequestParam(name="username",defaultValue="")String username)
	    {
		  return userStructDao.findDept(username) ; 
	   }
}
