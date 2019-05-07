package application.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.Utilisateur;
import application.service.UserService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService ; 
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	@GetMapping("/allUsers")
	public List<Utilisateur> getAll() {
		return userService.getAll() ; 
	}
	
	@PostMapping("/addUser")
	public Utilisateur addUser(@RequestBody Utilisateur user)
	{
		return userService.add(user);
	}

	@GetMapping(value="/findUser")
	  public Optional<Utilisateur> getUserByOne(@RequestParam(name="username",defaultValue="")String username)
	    {
		  return userService.getOneUser(username) ; 
	    }
    
	@GetMapping(value="/findUserByDept")
	  public List<Utilisateur> getUserByDept(@RequestParam(name="codeDept",defaultValue="")String codeDept)
	    {
		  return userService.getUsersByDept(codeDept) ; 
	    }
	
	

}
