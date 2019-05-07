package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Fonction;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction,Long>{

}
