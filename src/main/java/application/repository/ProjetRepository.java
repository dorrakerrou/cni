package application.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import application.model.Projet;
import application.model.ProjetPK;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Class<ProjetPK>>{

	
	@Query("select o from Projet o ,DeptGen p where p.code =:codeDept and o.code= p.code")
	public List<Projet> findProjetByDept(@Param("codeDept")String codeDept);
   
	@Transactional
	@Modifying
	@Query("delete from Projet ord where  ord.code=:i and ord.codPrj=:k ")
	int delete(@Param("i") String code,@Param("k") String codPrj);

	@Query("select MAX(m.codPrj) from Projet m , DeptGen d where m.code=:codeDept and m.code=d.code")
	public String LatestProjetCode(@Param("codeDept")String codeDept);
}
