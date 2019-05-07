package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import application.model.Zone;


@Repository
public interface ZoneRepository extends JpaRepository<Zone, String>{

}
