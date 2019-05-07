package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.DeptGen;

@Repository

public interface DeptRepository extends JpaRepository<DeptGen, Long> {

}
