package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Motcle;



public interface MotCleRepository extends JpaRepository<Motcle, Long> {

}
