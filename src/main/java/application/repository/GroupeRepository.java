package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Groupe;

@Repository

public interface GroupeRepository extends JpaRepository <Groupe, Long> {

}
