package application.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.AvoirBudget;
import application.model.AvoirBudgetPK;
import application.model.Mission;

@Repository
public interface  AvoirBudgetRepository extends JpaRepository<AvoirBudget, Class<AvoirBudgetPK>>
{
	//where a.date_budg =(select MAX(a.date_budg) from AvoirBudget a ,DeptGen d  where a.depart.code=d.code ) and 
	@Query("select a from AvoirBudget a,DeptGen d where a.depart.code=:codeDept and a.depart.code=d.code and a.date_budg =(select MAX(a.date_budg) from AvoirBudget a   where a.depart.code=d.code ) ")
	List<AvoirBudget> findBugetByDeptByYears(@Param("codeDept") String codeDept);
	
	@Query("select o from AvoirBudget o where o.type_budget=:x")
	List<AvoirBudget> getAvoirBudgetByType(@Param("x") String type_budget);

	
	@Query("select o from AvoirBudget o where o.date_val=:x")
	List<AvoirBudget> getBudgetByDate(@Param("x") Date date_val);
	
	
	@Query("select o from AvoirBudget o , DeptGen d where o.annee=:y and o.depart.code=:codeDept and o.depart.code=d.code")
	List<AvoirBudget> getBudgetByDeptByAnnee( @Param("y") Date annee, @Param("codeDept") String codeDept);

}
