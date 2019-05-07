package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import application.model.TypFrais;

@Repository
public interface TypFraisRepository extends JpaRepository<TypFrais, String>  {

}
