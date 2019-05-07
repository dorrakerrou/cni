package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Utilisateur;


@Repository
public interface UserRepository extends JpaRepository<Utilisateur, String>{

	Utilisateur findByUsername(String str);
	@Query("select o from Utilisateur o ")
	public List<Utilisateur> findUserByDept(@Param("codeDept")String codeDept);
}