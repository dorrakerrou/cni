package application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.DeptGen;

import application.model.UserStruct;

@Repository
public interface UserStructRepository extends JpaRepository<UserStruct, Long>  {
	
	
	@Query("select d from DeptGen d , UserStruct u  where u.dateAffectation =(select MAX(dateAffectation) from UserStruct  ) and u.utilisateur.username=:username and u.departement.code=d.code ")
	DeptGen findDeptGen(@Param("username")String username);

	

	
}
