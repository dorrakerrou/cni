package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Classe;

@Repository

public interface ClasseRepository extends JpaRepository<Classe, String>{

}
