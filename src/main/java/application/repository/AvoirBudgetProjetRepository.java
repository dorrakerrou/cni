package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.AvoirBudgetProjet;
import application.model.AvoirBudgetProjetPK;



@Repository
public interface  AvoirBudgetProjetRepository extends JpaRepository<AvoirBudgetProjet, Class<AvoirBudgetProjetPK>>
{
	@Query("select a from AvoirBudgetProjet a , DeptGen d where d.code=:codeDept and a.code= d.code ")
	List<AvoirBudgetProjet> findBugetPByDept(@Param("codeDept") String codeDept);	
	
}

