package pl.edu.wszib.jwd.onlinestore.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;

public interface BicycleRepository extends JpaRepository<BicycleEntity, Long> {

}
