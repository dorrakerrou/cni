package application;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import application.model.Role;
import application.model.Utilisateur;
import application.repository.RoleRepository;
import application.repository.UserRepository;
import application.util.RoleEnum;

@SpringBootApplication
@EntityScan("application.*")
public class MissCniApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(MissCniApplication.class, args);
	RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
        Role roleOrd = new Role(RoleEnum.ROLE_ORD)  ; 
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		Role roleControl = new Role(RoleEnum.ROLE_CONTROL);
		Role rolePayeur = new Role(RoleEnum.ROLE_PAYEUR) ; 
		Role roleMinstr = new Role(RoleEnum.ROLE_MINSTR) ; 
		
		
		roleRepository.save(roleOrd) ; 
		roleRepository.save(roleControl) ;
		roleRepository.save(rolePayeur) ; 
		roleRepository.save(roleMinstr) ; 
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		Utilisateur user = new Utilisateur("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));
		userRepository.save(user);

		Utilisateur use = new Utilisateur("11406266", "pass", true);
		use.setRoles(Arrays.asList(roleUser, roleMinstr));
		userRepository.save(use);

		
		Utilisateur admin = new Utilisateur("12345678", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		userRepository.save(admin);

		Utilisateur user1 = new Utilisateur("11406260", "ikram", true);
		user1.setRoles(Arrays.asList(roleOrd,roleUser));
		userRepository.save(user1);
		

	}

}
