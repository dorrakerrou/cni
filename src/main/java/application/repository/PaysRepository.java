package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, String>  {

}
